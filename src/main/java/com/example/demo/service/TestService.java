package com.example.demo.service;


import com.example.demo.pojo.ClassNo;
import org.springframework.beans.factory.annotation.Autowired;

public interface TestService {


    void selectClass(ClassNo classNo);
}
