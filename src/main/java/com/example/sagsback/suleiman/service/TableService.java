package com.example.sagsback.suleiman.service;

import com.example.sagsback.suleiman.entity.CourseTable;
import com.example.sagsback.suleiman.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {
    @Autowired
    private TableRepository tableRepository;
    public List<CourseTable> fetchAllCourses(){
        return tableRepository.findAll();
    }
    public void saveTable(CourseTable courseTable){
        tableRepository.save(courseTable);
    }

    public CourseTable fetchTableByName(String name) {
        return tableRepository.getCourseTableByName(name);
    }
}
