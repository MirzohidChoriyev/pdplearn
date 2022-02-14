package com.example.pdplearn.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "aholi_soni")
    private Integer aholiSoni;

    @Column(name = "area")
    private double area;

    @ManyToOne(fetch = FetchType.LAZY)
    private Region region;
}
