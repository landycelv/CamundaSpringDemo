package com.petrochina.camundaspringdemo;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableProcessApplication
@ComponentScan({"com.petrochina"})
@EnableFeignClients(basePackages="com.petrochina")
@EnableEurekaClient
@EnableSwagger2
public class CamundaspringdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamundaspringdemoApplication.class, args);
    }

}
