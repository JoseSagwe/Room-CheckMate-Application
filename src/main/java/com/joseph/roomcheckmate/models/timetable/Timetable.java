package com.joseph.roomcheckmate.models.timetable;

import jakarta.persistence.*;

@Entity
//@Table(name = "timetables")
public class Timetable {

    public Timetable() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "weekDay")
    private String weekDay;

    private String unitCode;
    private String unitName;
    private String lecture;
    private String venue;
    private String time;
    private String program;
    private String school;
    private String department;
    private String academicYear;

    public Timetable(String weekDay, String unitCode, String unitName, String lecture, String venue, String time, String program, String school, String department, String academicYear) {
        this.weekDay = weekDay;
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.lecture = lecture;
        this.venue = venue;
        this.time = time;
        this.program = program;
        this.school = school;
        this.department = department;
        this.academicYear = academicYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }


}
