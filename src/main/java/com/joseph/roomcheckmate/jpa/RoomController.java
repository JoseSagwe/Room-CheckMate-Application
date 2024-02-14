package com.joseph.roomcheckmate.jpa;

import com.joseph.roomcheckmate.models.room.Room;
import com.joseph.roomcheckmate.repository.RoomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RoomController {
    private final RoomRepository roomRepository;
    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping("/home")
    public String goHome() {
        return "welcomepage";
    }

    @GetMapping("/checkRoomForm")
    public String showRoomForm() {
        return "checkRoomForm";
    }

    @RequestMapping("/listRooms")
    public String listRooms(ModelMap model) {
        List<Room> rooms = roomRepository.findAll();
        model.addAttribute("rooms", rooms);
        return "listRooms";
    }

    @RequestMapping("/checkBlock")
    public String checkBlock() {
        return "checkBlock";
    }

    @PostMapping("/getRooms")
    public String getRooms(@RequestParam String block, ModelMap model) {
        List<Room> rooms = roomRepository.findByBlock(block);
        model.addAttribute("rooms", rooms);
        return "listRooms";
    }

    @GetMapping("/availableRoomsForm")
    public String showRoomForm2() {
        return "availableRoomsForm";
    }

    @GetMapping("/roomForm")
    public String roomForm() {
        return "roomForm";
    }

    @GetMapping("/availableLTForm")
    public String showLTForm() {
        return "availableLTForm";
    }

    @PostMapping("/getAvailableRooms")
    public String getAvailableRooms(ModelMap model, @RequestParam String block, @RequestParam String roomNumber, @RequestParam String weekDay, @RequestParam String time) {
        List<Room> availableRooms = roomRepository.findByBlockAndRoomNumberAndWeekDayAndTime(block, roomNumber, weekDay, time);
        model.addAttribute("rooms", availableRooms);
        return "listRooms";
    }

    @PostMapping("/getRoomDetails")
    public String getRoomDetails(ModelMap model, @RequestParam String block, @RequestParam String roomNumber, @RequestParam String weekDay) {
        List<Room> availableRooms = roomRepository.findByBlockAndRoomNumberAndWeekDay(block, roomNumber, weekDay);
        model.addAttribute("rooms", availableRooms);
        return "listRooms";
    }

    @PostMapping("/getAvailableLT")
    public String getAvailableLectureTheater(ModelMap model, @RequestParam String block, @RequestParam String roomNumber, @RequestParam String weekDay, @RequestParam String time) {
        List<Room> availableRooms = roomRepository.findByBlockAndRoomNumberAndWeekDayAndTime(block, roomNumber, weekDay, time);
        model.addAttribute("rooms", availableRooms);
        return "listRooms";
    }

    @GetMapping("/timetables")
    public String findTimetable() {
        return "timetables";
    }
    @GetMapping("/roomBooking")
    public String roomBooking() {
        return "roomBooking";
    }
}
