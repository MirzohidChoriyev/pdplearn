package com.example.pdplearn.repository;

import com.example.pdplearn.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByIdNotNullOrderByIdDesc();
    Page<Student> findAllByIdNotNullOrderByIdDesc(Pageable pageable);
}
