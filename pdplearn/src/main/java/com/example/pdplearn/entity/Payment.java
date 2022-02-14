package com.example.pdplearn.entity;

import com.example.pdplearn.entity.enums.Paytype;

import javax.persistence.*;
import java.sql.Timestamp;

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp pay_date;
    private double amount;
    private String comment;
    private Paytype paytype;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;
}
