package com.example.demo.service.impl;

import com.example.demo.dao.TestDao;
import com.example.demo.pojo.ClassNo;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestDao testDao;

    @Override
    public void selectClass(ClassNo classNo) {


        testDao.insertClass(classNo);

    }
}
