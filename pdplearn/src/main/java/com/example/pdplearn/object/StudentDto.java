package com.example.pdplearn.object;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private String fullname;
    private Date birthday;
    private Integer age;
    private Integer course;
}
