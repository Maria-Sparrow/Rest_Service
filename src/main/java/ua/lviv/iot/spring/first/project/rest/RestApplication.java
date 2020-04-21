package ua.lviv.iot.spring.first.project.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories({ "ua.lviv.iot.spring.first.dataaccess" })
public class RestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

}
/*({ "ua.lviv.iot.spring.first.dataaccess", "ua.lviv.iot.spring.first.business",
    "ua.lviv.iot.spring.first.project.rest.controller" })*/