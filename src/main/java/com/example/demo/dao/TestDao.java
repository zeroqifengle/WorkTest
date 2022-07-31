package com.example.demo.dao;


import com.example.demo.pojo.ClassNo;
import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface TestDao {

 void insertClass(ClassNo classNo);


 void insertStudent(Student student);

}
