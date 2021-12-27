package com.leejh.controller;

import com.leejh.entity.Student;
import com.leejh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class StudentController {
  @Autowired
  private StudentRepository studentRepository;

  @GetMapping("/student")
  public void get(@RequestBody Student student){
//    Student student = studentRepository.findByName(name);
//    studentRepository.update(age, id);
//    studentRepository.delete(id);
    studentRepository.save(student);
  }


  @GetMapping("/hello")
  public void hello(){
    String s = UUID.randomUUID().toString().replace("-", "");

    System.out.println(s);

  }


}
