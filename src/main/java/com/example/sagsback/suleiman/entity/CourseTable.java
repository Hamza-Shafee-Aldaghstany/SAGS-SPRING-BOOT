package com.example.sagsback.suleiman.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
}
