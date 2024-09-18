package com.jongwon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// Scheduling 활성화
@EnableScheduling
public class SpringBatchPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchPracticeApplication.class, args);
    }

}
