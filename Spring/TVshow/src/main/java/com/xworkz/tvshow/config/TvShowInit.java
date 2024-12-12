package com.xworkz.tvshow.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class TvShowInit  extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" root class ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Servlet config class ");
		return new Class[] {TvShowConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" Servlet map class ");
		return new String[] {"/"};
	}

}
