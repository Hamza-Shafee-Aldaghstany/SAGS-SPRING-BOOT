package com.example.sagsback.suleiman.service;

import com.example.sagsback.suleiman.entity.CourseCell;
import com.example.sagsback.suleiman.repository.CellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CellService {
    @Autowired
    private CellRepository cellRepository;
    public List<CourseCell> fetchAllCell() {
        return cellRepository.findAll();
    }

    public CourseCell fetchCellById(long id) {
        return cellRepository.getById(id);
    }

    public void saveCell(CourseCell courseCell) {
        cellRepository.save(courseCell);
    }

    public CourseCell fetchCellByRowNAndColumnN(int rowN, int columnN) {
        return cellRepository.findByRowIdAndColId(rowN,columnN);
    }
}
