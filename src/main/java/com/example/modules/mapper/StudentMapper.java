package com.example.modules.mapper;

import com.example.modules.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> getStudentByName(@Param("name") String name);
}
