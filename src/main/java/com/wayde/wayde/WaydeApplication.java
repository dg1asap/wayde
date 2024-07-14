package com.wayde.wayde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.wayde.wayde.api",
        "com.wayde.wayde.config",
        "com.wayde.wayde.domain",
        "com.wayde.wayde.infrastructure"})
public class WaydeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaydeApplication.class, args);
    }

}
