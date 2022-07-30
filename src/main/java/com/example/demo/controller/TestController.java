package com.example.demo.controller;


import com.example.demo.pojo.ClassNo;
import com.example.demo.service.TestService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;



    @PostMapping("/add")
    public void addClass(@RequestBody ClassNo classNo) {

        testService.selectClass(classNo);

    }


}
