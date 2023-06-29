package com.example.sagsback.suleiman.repository;

import com.example.sagsback.suleiman.entity.CourseTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<CourseTable, Long> {
    CourseTable getCourseTableByName(String name);
}
