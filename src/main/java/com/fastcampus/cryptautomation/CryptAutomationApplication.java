package com.fastcampus.cryptautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CryptAutomationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CryptAutomationApplication.class, args);
        SpringApplication.exit(run);
    }

}
