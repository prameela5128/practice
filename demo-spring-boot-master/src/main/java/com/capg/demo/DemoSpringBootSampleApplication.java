package com.capg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootSampleApplication.class, args);
	}
//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver vsr=new InternalResourceViewResolver();
//		vsr.setSuffix(".jsp");
//		vsr.setPrefix("views/");
//		return vsr;
//	}

}
