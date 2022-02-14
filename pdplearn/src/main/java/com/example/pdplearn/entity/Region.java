package com.example.pdplearn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "1000")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "aholi_soni")
    private Integer aholiSoni;

    @Column(name = "area")
    private double area;
}
