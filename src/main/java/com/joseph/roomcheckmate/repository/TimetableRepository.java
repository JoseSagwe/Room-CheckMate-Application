package com.joseph.roomcheckmate.repository;


import com.joseph.roomcheckmate.models.timetable.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Long> {
    List<Timetable> findByProgram(String program);

    List<Timetable> findByProgramAndSchool(String program, String school);
    List<Timetable> findByProgramAndTimeAndWeekDay(String program, String time, String weekDay);

}