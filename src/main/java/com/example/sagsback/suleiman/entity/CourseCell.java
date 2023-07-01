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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_cell_generator")
    private Long id;
    private String data;
    private int rowId;
    private int colId;
}
