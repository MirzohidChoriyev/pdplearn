package com.example.pdplearn.repository;

import com.example.pdplearn.entity.entityTraining.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
}
