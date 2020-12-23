package com.example.modules.service;

import com.example.modules.entity.Student;

import java.util.List;

public interface IStudentSerivce {

    public List<Student> getStudentByName(String name);
}
