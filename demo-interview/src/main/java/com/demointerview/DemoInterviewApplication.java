package com.demointerview;

import com.demointerview.mapper.DirectorDetailsMapper;
import org.mapstruct.MapperConfig;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class DemoInterviewApplication {




	public static void main(String[] args) {


		SpringApplication.run(DemoInterviewApplication.class, args);
	}

}
