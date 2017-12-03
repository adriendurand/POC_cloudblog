package fr.adurand.poc.cloudblog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CloudblogServer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    String home() {
        logger.debug("TEST");
        return "Welcome to Cloudblog, the new generation of Skyblog.";

    }

    public static void main(String[] args) {
        SpringApplication.run(CloudblogServer.class, args);
    }

}


