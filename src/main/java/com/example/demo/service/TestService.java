package com.example.demo.service;


import com.example.demo.pojo.ClassNo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public interface TestService {


    void selectClass(ClassNo classNo);

   void selectClassWork(ClassNo classNo);

}
