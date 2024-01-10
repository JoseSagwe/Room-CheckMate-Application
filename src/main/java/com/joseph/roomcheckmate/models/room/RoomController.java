//package com.joseph.roomcheckmate.models.room;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
////@Controller
//public class RoomController {
//
////    @Autowired
//    private RoomService roomService;
//
//    public RoomController(RoomService roomService) {
//        this.roomService = roomService;
//    }
//
//
//    @GetMapping("/checkRoomForm")
//    public String showRoomForm() {
//        return "checkRoomForm";
//    }
//
//    @RequestMapping("/listRooms")
//    public String listRooms(ModelMap model) {
//        List<Room> rooms = roomService.getAllRooms();
//        model.addAttribute("rooms", rooms);
//        return "listRooms";
//    }
//
////    @RequestMapping("/northern")
////    public String listNorthernRooms(ModelMap model) {
////        List<Room> rooms = roomService.getNorthernRooms("Northern");
////        model.addAttribute("rooms", rooms);
////        return "listRooms";
////    }
////
////    @RequestMapping("/tbh")
////    public String listTBHRooms(ModelMap model) {
////        List<Room> rooms = roomService.getTBHRooms("TBH");
////        model.addAttribute("rooms", rooms);
////        return "listRooms";
////    }
//
//    @RequestMapping("/checkBlock")
//    public String checkBlock(){
//        return "checkBlock";
//    }
//
//
//    @PostMapping("/getRooms")
//    public String getRooms(@RequestParam String block, ModelMap model) {
//        List<Room> rooms = roomService.getRoomsByBlock(block);
//        model.addAttribute("rooms", rooms);
//        return "listRooms";
//    }
//
//
//    @GetMapping("/availableRoomsForm")
//    public String showRoomForm2() {
//        return "availableRoomsForm";
//    }
//
//    @PostMapping("/getAvailableRooms")
//    public String getAvailableRooms(ModelMap model, @RequestParam String block, @RequestParam String roomNumber, @RequestParam String day, @RequestParam String time) {
//        List<Room> availableRooms = roomService.getAvailableRooms(block, roomNumber, day, time);
//        model.addAttribute("rooms", availableRooms); // Update the attribute name to "rooms"
//        return "listRooms"; // Replace with the appropriate JSP file name for the list of rooms
//    }
//
//    @GetMapping("/timetables")
//    public String findTimetable() {
//        return "timetables";
//    }
//
//    @GetMapping("/roomBooking")
//    public String roomBooking() {
//        return "roomBooking";
//    }
//
//
//
//}
