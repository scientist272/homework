package com.charlie.homework.controller;

import com.charlie.homework.entity.Test;
import com.charlie.homework.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
    @Autowired
    private TestMapper mapper;

    @RequestMapping("/login")
    public Test login(@RequestParam(name = "name", required = false) String name) {
        return mapper.select(name);
    }

}
