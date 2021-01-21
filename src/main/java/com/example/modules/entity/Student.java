package com.example.modules.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private String id;

    private String name;

    private Integer age;

    private String classNum;

    public Student(String id, String name, int age, String classNum) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.classNum =classNum;
    }
}
