package com.htdata.firstboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.htdata.firstboot.controller","com.htdata.firstboot.service"})
@MapperScan(basePackages = {"com.htdata.firstboot.dao"})

public class FirstbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbootApplication.class, args);
	}
}
