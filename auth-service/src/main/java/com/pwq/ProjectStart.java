package com.pwq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class ProjectStart {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(ProjectStart.class, args);
        final String port = context.getEnvironment().getProperty("server.port");
        log.info("访问链接：http://localhost:" + port);
    }
}
