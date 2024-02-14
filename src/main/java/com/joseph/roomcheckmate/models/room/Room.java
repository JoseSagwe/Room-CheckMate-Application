package com.joseph.roomcheckmate.models.room;

import jakarta.persistence.*;

@Entity
//@Table(name = "rooms")
public class Room {
    public Room() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private  String block;
    private String roomNumber;
    private String weekDay;
    private String time;
    private int capacity;
    private String status;

    public Room(Integer id, String block, String roomNumber, String weekDay, String time, int capacity, String status) {
        Id = id;
        this.block = block;
        this.roomNumber = roomNumber;
        this.weekDay = weekDay;
        this.time = time;
        this.capacity = capacity;
        this.status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDay() {
        return weekDay;
    }

    public void setDay(String day) {
        this.weekDay = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Id=" + Id +
                ", block='" + block + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", day='" + weekDay + '\'' +
                ", time='" + time + '\'' +
                ", capacity=" + capacity +
                ", status='" + status + '\'' +
                '}';
    }
}
