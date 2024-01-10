package com.joseph.roomcheckmate.models.timetable;

import com.joseph.roomcheckmate.repository.TimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TimetableController {

    @Autowired
    private TimetableRepository timetableRepository;

    public TimetableController(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }

    @GetMapping("/timetableForm")
    public String timetableForm(){
        return "timetableForm";
    }

    @GetMapping("/timetable")
    public String timetable(){
        return "timetableList";
    }


//    @PostMapping("/getTimetable")
//    public String getTimetable(ModelMap model, @RequestParam String program, @RequestParam String time, @RequestParam String weekday) {
//        List<Timetable> timetable = timetableRepository.findByProgramAndTimeAndWeekDay(program, time, weekday);
//        model.addAttribute("timetable", timetable);
//        return "timetableList";
//    }


    @PostMapping("/getTimetable")
    public String getTimetable(ModelMap model, @RequestParam String program) {
        List<Timetable> timetableList = timetableRepository.findByProgram(program);
        model.addAttribute("timetable", timetableList);
        model.put("program", program);
        return "timetableList";
    }
//
//    @RequestMapping("/list")
//    public String listTimetable(ModelMap model) {
//        List<Timetable> timetableList = timetableRepository.findAll();
//        model.addAttribute("timetable", timetableList);
//        return "timetableList";
//    }
}
