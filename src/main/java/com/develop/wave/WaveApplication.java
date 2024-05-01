package com.develop.wave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//https://www.innofactory.net/blog/posts/seanbryu/20231003-spring-helloworld/
@RestController
@SpringBootApplication
public class WaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaveApplication.class, args);
    }

    @GetMapping(value = "/")
    public String helloWorld() {
        return "Hello World!!";
    }

}
