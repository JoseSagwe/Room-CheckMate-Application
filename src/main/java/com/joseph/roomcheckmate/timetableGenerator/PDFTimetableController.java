package com.joseph.roomcheckmate.timetableGenerator;


import com.joseph.roomcheckmate.models.timetable.Timetable;
import com.joseph.roomcheckmate.models.timetable.TimetableRepository;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@Controller
public class PDFTimetableController {

    private final TimetableRepository timetableRepository;

    public PDFTimetableController(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }

    @GetMapping("/pdfTimetableForm")
    public String showPDFTimetableForm() {
        return "pdfTimetableForm";
    }

    @PostMapping(value = "/openpdf/timetable", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> timetableReport(ModelMap model, @RequestParam String program) throws IOException {
        List<Timetable> timetables = timetableRepository.findByProgram(program);
        model.addAttribute("timetable", timetables);
        model.put("program", program);

        ByteArrayInputStream bis = DatabaseTimetablePDFService.timetablePDFReport(timetables);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=timetable.pdf");

        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
}
