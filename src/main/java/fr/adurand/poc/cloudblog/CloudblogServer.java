package fr.adurand.poc.cloudblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CloudblogServer {

    @RequestMapping("/")
    String home() {
        return "Welcome to Cloudblog, the new generation of Skyblog.";
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudblogServer.class, args);
    }

}


