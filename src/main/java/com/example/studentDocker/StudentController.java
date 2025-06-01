package com.example.studentDocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/students")
    public List<Student> getStudent(){
            return studentRepo.findAll();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }
}
