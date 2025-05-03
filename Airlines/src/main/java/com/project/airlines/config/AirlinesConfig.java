package com.project.airlines.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.project.airlines")
@EnableWebMvc
public class AirlinesConfig implements WebMvcConfigurer{ 

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "welcome.jsp");
	}
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addRedirectViewController("/", "welcome.jsp");
//	}
	
	@Bean
	public ViewResolver viewResolver() {
		return new InternalResourceViewResolver("/",".jsp");
	}
	
//	@Bean
//	public ViewResolver viewResoolver() {
//		return new InternalResourceViewResolver("/",".jsp");
//	}
	
}
