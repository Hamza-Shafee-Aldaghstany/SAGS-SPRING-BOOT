package com.example.sagsback.suleiman.entity;

import com.example.sagsback.Hamza.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_table_generator")
    private Long id;
    private String name;
    private String description;
    private int rowN;
    private int columnN;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "table_id", referencedColumnName = "id")
    private List<CourseCell> courseCells;
    public void pushOneCell(CourseCell courseCell){
        courseCells.add(courseCell);
    }
    public void UpdateCell(CourseCell courseCell){
        for (int i = 0; i < courseCells.size(); i++) {
            if(courseCells.get(i).getId()== courseCell.getId()){
                courseCells.get(i).setData(courseCell.getData());
                break;
            }
        }
    }
}
