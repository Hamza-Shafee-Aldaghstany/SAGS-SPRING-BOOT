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
    @GetMapping("/cell")
    public List<CourseCell> getAllCell(){
       return  cellService.fetchAllCell();
    }
    @GetMapping("/cell/id")
    public CourseCell getCellById(@RequestParam long id){
        return cellService.fetchCellById(id);
    }
    @PostMapping("/cell")
    public void saveCell( CourseCell courseCell){
        cellService.saveCell(courseCell);
    }
    @GetMapping("/cell/row/column")
    public CourseCell getCellByRowNAndColumnN(@RequestParam int rowN,@RequestParam int columnN ){
        return cellService.fetchCellByRowNAndColumnN(rowN,columnN);
    }
    @PutMapping("/cell/update")
    public void updateCell( CourseCell courseCell){
       CourseCell cell = cellService.fetchCellByRowNAndColumnN(courseCell.getRowId(),courseCell.getColId());
       cell.setData(courseCell.getData());
       cellService.saveCell(cell);
    }
}
