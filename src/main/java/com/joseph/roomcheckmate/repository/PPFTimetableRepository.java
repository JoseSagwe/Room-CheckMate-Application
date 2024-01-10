package com.joseph.roomcheckmate.repository;


import com.joseph.roomcheckmate.models.timetable.Timetable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PPFTimetableRepository extends CrudRepository<Timetable, Long> {

        List<Timetable> findByProgram(String program);

}

