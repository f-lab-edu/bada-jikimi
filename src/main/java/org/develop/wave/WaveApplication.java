package org.develop.wave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WaveApplication {

//    https://i5i5.tistory.com/253
    @RequestMapping("/")
    String home() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(WaveApplication.class, args);
    }

}
