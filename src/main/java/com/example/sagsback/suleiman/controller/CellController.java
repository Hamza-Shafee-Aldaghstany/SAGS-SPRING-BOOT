package com.example.sagsback.suleiman.controller;

import com.example.sagsback.suleiman.entity.CourseCell;
import com.example.sagsback.suleiman.entity.CourseTable;
import com.example.sagsback.suleiman.repository.TableRepository;
import com.example.sagsback.suleiman.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CellController {
    @Autowired
    private CellService cellService;
    @Autowired
    private TableRepository tableRepository;
    @GetMapping("/cell")
    public List<CourseCell> getAllCell(){
       return  cellService.fetchAllCell();
    }
    @GetMapping("/cell/id")
    public CourseCell getCellById(@RequestParam long id){
        return cellService.fetchCellById(id);
    }
    @PostMapping("/cell")
    public void saveCell( CourseCell courseCell, @RequestParam long tableId){
        CourseTable courseTableTable = tableRepository.getById(tableId);
        System.out.println(courseTableTable);
        courseCell.setCourseTable(courseTableTable);
        cellService.saveCell(courseCell);
        courseTableTable.pushOneCell(courseCell);
        tableRepository.save(courseTableTable);
    }
    @GetMapping("/cell/row/column")
    public CourseCell getCellByRowNAndColumnN(@RequestParam int rowN,@RequestParam int columnN ){
        return cellService.fetchCellByRowNAndColumnN(rowN,columnN);
    }
    @PutMapping("/cell/update")
    public void updateCell( CourseCell courseCell, @RequestParam long tableId){
        CourseTable courseTableTable = tableRepository.getById(tableId);
        CourseCell courseCell1 = cellService.fetchCellById(courseCell.getId());
        System.out.println(courseCell1);
        courseCell1.setData(courseCell.getData());
        cellService.saveCell(courseCell);
        courseTableTable.UpdateCell(courseCell);
        tableRepository.save(courseTableTable);
    }
}
