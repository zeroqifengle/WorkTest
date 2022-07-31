package com.example.demo.controller;


import com.example.demo.pojo.ClassNo;
import com.example.demo.pojo.Student;
import com.example.demo.service.TestService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 新增班级
     */

    @PostMapping("/cfh/addClassWork")
    @Transactional
    public Map<String, Object> addClassWork(@RequestBody ClassNo classNo) {

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("flag", "Y");

        if (StringUtils.isEmpty(classNo.getClassName())) {
            resultMap.put("flag", "N");
            resultMap.put("msg", "班级为空");
            return resultMap;
        }
        List<Student> list = classNo.getList();
        if ( list== null) {
            resultMap.put("flag", "N");
            resultMap.put("msg", "学生为空");
            return resultMap;
        }
        try{
            testService.selectClassWork(classNo);
            resultMap.put("msg","新增成功");
        } catch (Exception ex){
            ex.printStackTrace();
            resultMap.put("flag", "N");
            resultMap.put("msg", ex.getMessage());
        }
            return resultMap;
    }

}
