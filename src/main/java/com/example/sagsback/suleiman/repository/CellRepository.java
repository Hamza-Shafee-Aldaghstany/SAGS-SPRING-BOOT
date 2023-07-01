package com.example.sagsback.suleiman.repository;

import com.example.sagsback.suleiman.entity.CourseCell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellRepository extends JpaRepository<CourseCell,Long> {
    CourseCell findByRowIdAndColId(int rowId,int colId);
}
