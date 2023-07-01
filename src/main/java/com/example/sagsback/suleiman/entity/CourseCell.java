package com.example.sagsback.suleiman.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "courseTable_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private CourseTable courseTable;
}
