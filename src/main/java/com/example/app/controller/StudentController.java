package com.example.app.controller;


import com.example.app.db.DataBase;
import com.example.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return DataBase.studentsDatable.get(id);
    }

    @GetMapping("/all")
    public ArrayList<Student> getAllStudents(){
        return DataBase.studentsDatable;
    }
}
