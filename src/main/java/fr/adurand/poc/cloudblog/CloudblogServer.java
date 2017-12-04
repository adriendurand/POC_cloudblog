package fr.adurand.poc.cloudblog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@Slf4j
public class CloudblogServer {

    @RequestMapping("/")
    String home() {
        log.debug("Welcome to Cloudblog, the new generation of Skyblog.");
        return "Welcome to Cloudblog, the new generation of Skyblog.";

    }

    public static void main(String[] args) {
        SpringApplication.run(CloudblogServer.class, args);
    }

}


