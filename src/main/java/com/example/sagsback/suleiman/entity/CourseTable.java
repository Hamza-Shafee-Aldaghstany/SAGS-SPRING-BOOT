package com.example.sagsback.suleiman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    private Date createdDate;
    private String description;


}
