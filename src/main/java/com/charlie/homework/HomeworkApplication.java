package com.charlie.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.charlie.homework.mapper",
        "com.charlie.homework.controller",
        "com.charlie.homework.service"
})
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
    }
}
