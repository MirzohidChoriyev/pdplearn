package com.example.pdplearn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "guruhlar")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "teach_count")
    private Integer teach_count;

    @Column(name = "start_group")
    private Date start_group;

    @Column(name = "davomiyligi")
    private String davomiyligi;

    @Column(name = "capacity")
    private Integer capacity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Mentor mentor;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;
}
