package com.joseph.roomcheckmate.models.room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

    List<Room> findByBlock(String block);
    List<Room> findByBlockAndRoomNumberAndWeekDayAndTime(String block, String roomNumber, String weekDay, String time);
    List<Room> findByBlockAndStatus(String block, String status);

    List<Room> findByBlockAndRoomNumberAndWeekDay(String block, String roomNumber, String weekDay);
}

