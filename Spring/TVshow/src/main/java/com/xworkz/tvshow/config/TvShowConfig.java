
package com.xworkz.tvshow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class TvShowConfig {
	
	@Bean
	 public  ViewResolver getresponse(){
		 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		 resolver.setSuffix(".jsp");
		 return resolver;
	 }
	
	@Bean
	public LocalContainerEntityManagerFactoryBean getmanager() {
		
		return new LocalContainerEntityManagerFactoryBean();
	}

}
