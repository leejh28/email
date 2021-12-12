package com.leejh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Schedule1 {
    @Scheduled(cron = "*/5 * * * * ?")
    public void hello(){
        System.out.println("啊啊啊");
        System.out.println("哈哈哈");

    }

}
