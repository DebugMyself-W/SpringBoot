package com.example.modules.service.impl;

import com.example.modules.entity.Student;
import com.example.modules.mapper.StudentMapper;
import com.example.modules.service.IStudentSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements IStudentSerivce {
    @Autowired
    private StudentMapper mapper;

    @Override
    public List<Student> getStudentByName(String name) {
        return mapper.getStudentByName(name);
    }
}
