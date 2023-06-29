package com.example.sagsback.suleiman.entity;

import com.example.sagsback.Hamza.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @GeneratedValue
    private Long id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private String createdDate;
    private String description;
    private int rowN;
    private int columnN;
    @OneToMany(mappedBy = "courseTable", cascade = CascadeType.ALL)
    private List<CourseCell> courseCells = new ArrayList<>();
}
