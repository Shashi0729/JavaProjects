package com.xworkz.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class ProjectConfig {
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
	
	@Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setDefaultEncoding("utf-8");
        multipartResolver.setMaxUploadSize(2097152); // 2MB
	    System.out.println("Multipart2 bean");
        return multipartResolver;
      }
	
	@Bean
	public CommonsMultipartResolver multipartResolver1() {
	    CommonsMultipartResolver resolver = new CommonsMultipartResolver();
	    resolver.setDefaultEncoding("utf-8");
	    resolver.setMaxUploadSize(10000);
	    resolver.setMaxUploadSizePerFile(1000);
	    System.out.println("Multipart2 bean");
	    return resolver;
	}
}
