package com.example.modules.controller;

import com.example.modules.entity.Student;
import com.example.modules.service.IStudentSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mySpringBoot")
@Slf4j
public class HelloController {

    @Autowired
    private IStudentSerivce studentSerivce;

    @GetMapping("/showIndex")
    public String showIndex(){
        log.info("====show my page");
        return "index";
    }

    @GetMapping("/getInfo")
    public List<Student> getStudent(){
        List<Student> ss=studentSerivce.getStudentByName("11");
        return ss;
    }
}
