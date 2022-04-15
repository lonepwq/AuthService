package com.pwq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@Slf4j
public class ProjectStart {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(ProjectStart.class, args);
        final String port = context.getEnvironment().getProperty("server.port");
        final String contextPath = context.getEnvironment().getProperty("server.servlet.context-path");
        log.info("访问链接：http://localhost:{}{}", port, contextPath);
        log.info("swagger链接：http://localhost:{}{}/swagger-ui/index.html", port, contextPath);
    }
}
