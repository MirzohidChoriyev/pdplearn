package com.example.pdplearn.service;

import com.example.pdplearn.entity.Student;
import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.StudentDto;
import com.example.pdplearn.repository.StudentRepository;
import com.example.pdplearn.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired(required = true)
    StudentRepository studentRepository;

    public ApiResponse saveStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setAge(studentDto.getAge());
        student.setBirthday(studentDto.getBirthday());
        student.setCourse(studentDto.getCourse());
        student.setFullname(studentDto.getFullname());
        studentRepository.save(student);
        return new ApiResponse("save", true, student);
    }

    public ApiResponse editResponse(Integer id, StudentDto studentDto) {
        Student student = studentRepository.getById(id);
        student.setFullname(studentDto.getFullname());
        student.setAge(studentDto.getAge());
        student.setBirthday(studentDto.getBirthday());
        student.setCourse(studentDto.getCourse());
        studentRepository.save(student);
        return new ApiResponse("Edited", true, student);
    }

    public ApiResponse getAll() {
        List<Student> studentList = studentRepository.findAllByIdNotNullOrderByIdDesc();
        return new ApiResponse("getAll", true, studentList);
    }

    public ApiResponse getById(Integer id) {
        Student student = studentRepository.getById(id);
//        Optional<Student> student = studentRepository.findById(id);
//        if(student.isPresent()){
//            return new ApiResponse("Ok", true, student.get());
//        } else {
//            return new ApiResponse("Error", false, student.get());
//        }
        return new ApiResponse("Ok", true, student);
    }

    public ApiResponse getAllParam(Integer page, Integer size) throws IllegalAccessException {
        //Pageable pageable = PageRequest.of(page, size);
        Page<Student> pages = studentRepository.findAllByIdNotNullOrderByIdDesc(CommonUtils.getPageableByIdAsc(page, size));
        return new ApiResponse("All student", true, pages.getContent(), pages.getTotalElements());
    }

    public ApiResponse deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return new ApiResponse("Deleted", true, id);
    }

    public void editAll() {
       List<Student> list = studentRepository.findAll();
        for (Student student : list) {
            student.setCourse(3);
        }
        studentRepository.saveAll(list);
    }

    public ApiResponse saveAll(List<StudentDto> studentDtos) {
        List<Student> studentList = new ArrayList<>();
        for (StudentDto studentDto : studentDtos) {
            studentList.add(new Student(studentDto.getFullname(), studentDto.getBirthday(), studentDto.getAge(), studentDto.getCourse()));
        }
        studentRepository.saveAll(studentList);
        return new ApiResponse("All saved", true);
    }
}
