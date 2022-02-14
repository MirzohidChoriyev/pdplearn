package com.example.pdplearn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "age")
    private Integer age;

    @Column(name = "course")
    private Integer course;

    @ManyToMany
    private List<Groups> groupsList;

    public Student(String fullname, Date birthday, Integer age, Integer course) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.age = age;
        this.course = course;
    }
}
