package com.example.sagsback.suleiman.controller;

import com.example.sagsback.suleiman.entity.CourseTable;
import com.example.sagsback.suleiman.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {
    @Autowired
    private TableService tableService;
    @GetMapping("/table")
    public List<CourseTable> getAllTable() {
        return tableService.fetchAllCourses();
    }
    @GetMapping("/table/name")
    public CourseTable getTableByName(@RequestParam String name) {
        return tableService.fetchTableByName(name);
    }

    @PostMapping("/table")
    public void saveTableRequest(CourseTable courseTable){
        tableService.saveTable(courseTable);
    }
}
