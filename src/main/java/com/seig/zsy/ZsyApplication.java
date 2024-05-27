package com.seig.zsy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.seig.zsy")
public class ZsyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZsyApplication.class, args);
    }

}
