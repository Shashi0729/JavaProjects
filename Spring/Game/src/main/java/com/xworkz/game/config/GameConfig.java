package com.xworkz.game.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz")
@Configuration
public class GameConfig {
	@Bean
	 public  ViewResolver getresponse(){
		 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		 resolver.setSuffix(".jsp");
		 return resolver;
	 }
}
