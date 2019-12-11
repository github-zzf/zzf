package com.emp.empboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.emp.empboot.dao")
public class EmpbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpbootApplication.class, args);
    }

}
