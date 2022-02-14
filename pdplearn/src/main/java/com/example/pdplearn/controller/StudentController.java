package com.example.pdplearn.controller;

import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.StudentDto;
import com.example.pdplearn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired(required = true)
    StudentService studentService;

    @PostMapping("/create")
    public ApiResponse saveStudent(@RequestBody StudentDto studentDto){
        return studentService.saveStudent(studentDto);
    }

    @PutMapping("/edit/{id}")
    public ApiResponse editStudent(@PathVariable Integer id, @RequestBody StudentDto studentDto){
        return studentService.editResponse(id, studentDto);
    }

    @GetMapping("/all")
    public ApiResponse getAll(){
        return studentService.getAll();
    }

    @GetMapping("/getid/{id}")
    public ApiResponse getById(@PathVariable Integer id){
        return studentService.getById(id);
    }

    @GetMapping("/paramall")
    public ApiResponse getAllParam(@RequestParam(defaultValue = "0")Integer page,
                                   @RequestParam(defaultValue = "20")Integer size) throws IllegalAccessException {
        return studentService.getAllParam(page, size);
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/editAll")
    public void editAll(){
        studentService.editAll();
    }

    @PostMapping("/saveall")
    public ApiResponse saveAll(List<StudentDto> studentDtos){
        return studentService.saveAll(studentDtos);
    }
}
