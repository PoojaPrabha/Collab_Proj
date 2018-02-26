package com.myproj.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc 
@ComponentScan(basePackages = "com.myproj")

public class WebConfig extends WebMvcConfigurerAdapter {

	public WebConfig() {
		System.out.println("WEBCONFIG class is INSTANTIATED");
	}
}