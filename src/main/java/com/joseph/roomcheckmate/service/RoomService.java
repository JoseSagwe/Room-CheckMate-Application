package com.joseph.roomcheckmate.service;




import com.joseph.roomcheckmate.models.room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Service
public class RoomService {


    private static List<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room(1,"Northern","N1","Monday","7 AM - 10AM",70,"Available"));
        rooms.add(new Room(2,"Northern","N2","Wednesday","1PM - 4PM",30,"Occupied"));
        rooms.add(new Room(3,"Northern","N3","Monday","7AM - 10AM",45,"Available"));
        rooms.add(new Room(4,"Northern","N4","Friday","4PM - 6PM",67,"Occupied"));
        rooms.add(new Room(5,"Northern","N5","Monday","7AM - 10AM",78,"Available"));
        rooms.add(new Room(6,"Northern","N6","Friday","1PM - 4PM",78,"Occupied"));
        rooms.add(new Room(7,"Northern","N7","Tuesday","7AM - 10AM",90,"Occupied"));
        rooms.add(new Room(8,"Northern","N8", "Wednesday","10AM - 1PM",67,"Occupied"));
        rooms.add(new Room(9,"Northern","N9","Thursday","1PM - 4PM",34,"Available"));
        rooms.add(new Room(10,"Northern","N10","Thursday","7AM - 10AM",78,"Occupied"));
        rooms.add(new Room(11,"Northern","N11","Friday","4PM - 7PM",67,"Available"));
        rooms.add(new Room(12,"Northern","N12","Monday","7AM - 10AM",34,"Occupied"));
        rooms.add(new Room(1,"TBH","TBH1","Thursday","4PM - 6PM",43,"Occupied"));
        rooms.add(new Room(2,"TBH","TBH2","Wednesday","10AM - 1PM",56,"Available"));
        rooms.add(new Room(3,"TBH","TBH3","Tuesday","1PM - 4PM",56,"Occupied"));
        rooms.add(new Room(4,"TBH","TBH4","Monday","10AM - 1PM",34,"Occupied"));
        rooms.add(new Room(5,"TBH","TBH5","Friday","1PM - 4PM",90,"Available"));
        rooms.add(new Room(6,"TBH","TBH6","Friday","7AM - 10AM",39,"Occupied"));
        rooms.add(new Room(7,"TBH","TBH7","Thursday","10AM - 1PM",79,"Occupied"));
        rooms.add(new Room(8,"TBH","TBH8","Tuesday","1PM - 4PM",45,"Available"));
        rooms.add(new Room(9,"TBH","TBH9","Friday","10AM - 1PM",40,"Occupied"));

    }

    public List<Room> getAllRooms() {
        return rooms;
    }


//    public List<Room> getNorthernRooms(String block) {
//        List<Room> northernRooms = new ArrayList<>();
//        for (Room room : rooms) {
//            if (room.getBlock().equalsIgnoreCase("Northern")) {
//                northernRooms.add(room);
//            }
//        }
//        return northernRooms;
//    }
//
//
//    public List<Room> getTBHRooms(String block) {
//        List<Room> northernRooms = new ArrayList<>();
//        for (Room room : rooms) {
//            if (room.getBlock().equalsIgnoreCase("TBH")) {
//                northernRooms.add(room);
//            }
//        }
//        return northernRooms;
//    }


    public List<Room> getBlockRooms(String block) {
        List<Room> blockRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getBlock().equalsIgnoreCase("Northern")) {
                blockRooms.add(room);
            }
            else if (room.getBlock().equalsIgnoreCase("TBH")){
                blockRooms.add(room);
            }
        }
        return blockRooms;
    }


    public List<Room> getRoomsByBlock(String block) {
        List<Room> filteredRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getBlock().equalsIgnoreCase(block)) {
                filteredRooms.add(room);
            }
        }
        return filteredRooms;
    }

    //AVAILABLE ROOM STATUS

//    public List<Room> getAvailableRooms(String block, String roomNumber, String day, String time) {
//        return rooms.stream()
//                .filter(room -> room.getBlock().equals(block) && room.getRoomNumber().equals(roomNumber) &&
//                        room.getDay().equals(day) && room.getTime().equals(time) && room.getStatus().equals("Available"))
//                .collect(Collectors.toList());
//    }

    public List<Room> getAvailableRooms(String block, String roomNumber, String weekDay, String time) {
        return rooms.stream()
                .filter(room -> room.getBlock().equals(block) && room.getRoomNumber().equals(roomNumber) &&
                        room.getDay().equals(weekDay) && room.getTime().equals(time))
                .collect(Collectors.toList());
    }


}
