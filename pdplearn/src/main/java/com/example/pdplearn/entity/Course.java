package com.example.pdplearn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price_per_month")
    private double pricePerMonth;

    @Column(name = "lessons_amount")
    private int lessonsAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    private LearningCenter learningCenter;
}
