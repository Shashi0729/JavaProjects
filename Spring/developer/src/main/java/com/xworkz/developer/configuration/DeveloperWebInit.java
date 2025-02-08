package com.xworkz.developer.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class DeveloperWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	@Override
	public Class<?>[] getRootConfigClasses() {
		System.out.println("Get Root Class");
		return null;
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		System.out.println("Get Servlet Class");
		return new Class[] {DeveloperConfiguration.class};
	}

	@Override
	public String[] getServletMappings() {
		System.out.println("Get Servlet Mapping");
		return new String[] {"/"};
	}

}
