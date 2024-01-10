package com.joseph.roomcheckmate.service;


import com.joseph.roomcheckmate.models.timetable.Timetable;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DatabaseTimetablePDFService {

    public static ByteArrayInputStream timetablePDFReport(List<Timetable> timetables) {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(document, out);
            document.open();

            Font fontHeader = FontFactory.getFont(FontFactory.TIMES_BOLD, 22);
            Paragraph para = new Paragraph("Semester Timetable for " + timetables.get(0).getProgram(), fontHeader);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(Chunk.NEWLINE);

            List<String> weekdays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
            List<String> timeSlots = List.of("7am - 10am", "10am - 1pm", "1pm - 4pm", "4pm - 7pm");

            PdfPTable table = new PdfPTable(6);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            PdfPCell cell = new PdfPCell();
            cell.setBackgroundColor(Color.CYAN);
            cell.setPadding(5);

            cell.setPhrase(new Phrase("Weekday"));
            table.addCell(cell);

            cell.setPhrase(new Phrase("Time"));
            table.addCell(cell);

            cell.setPhrase(new Phrase("Unit Code"));
            table.addCell(cell);

            cell.setPhrase(new Phrase("Unit Name"));
            table.addCell(cell);

            cell.setPhrase(new Phrase("Lecture"));
            table.addCell(cell);

            cell.setPhrase(new Phrase("Venue"));
            table.addCell(cell);

            for (String weekday : weekdays) {
                boolean firstRow = true;
                for (String timeSlot : timeSlots) {
                    table.addCell(firstRow ? weekday : "");

                    table.addCell(timeSlot);

                    Map<String, Timetable> timetableMap = timetables.stream()
                            .filter(t -> t.getWeekDay().equals(weekday) && t.getTime().equals(timeSlot))
                            .collect(Collectors.toMap(Timetable::getTime, t -> t));

                    if (timetableMap.containsKey(timeSlot)) {
                        Timetable timetable = timetableMap.get(timeSlot);
                        table.addCell(timetable.getUnitCode());
                        table.addCell(timetable.getUnitName());
                        table.addCell(timetable.getLecture());
                        table.addCell(timetable.getVenue());
                    } else {
                        table.addCell("");
                        table.addCell("");
                        table.addCell("");
                        table.addCell("");
                    }
                    firstRow = false;
                }
            }

            document.add(table);
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return new ByteArrayInputStream(out.toByteArray());
    }
}
