package com.xworks.airport.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworks.airport.dto.AirPortDto;
import com.xworks.airport.service.AirportService;
import com.xworks.airport.service.AirportServiceImpl;

@Component
@RequestMapping("/")
public class AirportController {
    @Autowired
	private AirportServiceImpl service;
    
    public AirportController() {
    	System.out.println("-============================");
    }
    
	@PostMapping("/submit")
	public String save(@ModelAttribute AirPortDto dto,Model model) {
		System.out.println(dto);
		String result = service.onSave(dto);
		model.addAttribute("save", dto);
		System.out.println(result);
		return "success";
	}
}
