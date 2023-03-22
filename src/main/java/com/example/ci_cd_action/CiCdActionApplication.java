package com.example.ci_cd_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdActionApplication {
    @GetMapping("/welcome")
    public String welcome(){
        return "hhh";
    }

    public static void main(String[] args) {
        SpringApplication.run(CiCdActionApplication.class, args);
    }

}
