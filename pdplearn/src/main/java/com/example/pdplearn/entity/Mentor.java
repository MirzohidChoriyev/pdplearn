package com.example.pdplearn.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "mentor")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "phone_number")
   private String phoneNumber;

    @Column(name = "age")
   private Integer age;

    @Column(name = "birth_day")
   private Date birthDay;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Course> courses;
}
