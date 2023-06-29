package com.example.sagsback.suleiman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseCell {
    @Id
    private Long id;
    private String data;
    private int rowId;
    private int colId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseTable_id")
    private CourseTable courseTable;
}
