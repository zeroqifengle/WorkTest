package com.example.demo.service.impl;

import com.example.demo.dao.TestDao;
import com.example.demo.pojo.ClassNo;
import com.example.demo.pojo.Student;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestDao testDao;

    @Override
    public void selectClass(ClassNo classNo) {


        testDao.insertClass(classNo);

    }

    @Override
    public void selectClassWork(ClassNo classNo) {


        List<Student> list = classNo.getList();

        //添加班级
        testDao.insertClass(classNo);
        //获取学生id
        String id = classNo.getId();
        if (list != null && list.size() > 0) {
            for (Student student:list) {
                student.setId(id);
                testDao.insertStudent(student);
            }
        }

    }
}













