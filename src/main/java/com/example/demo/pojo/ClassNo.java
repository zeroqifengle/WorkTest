package com.example.demo.pojo;


import lombok.Data;

import java.util.List;

@Data
public class ClassNo {

    private int id;

    private String className;

    private String classTeacher;

    private List<Student> list;


}
