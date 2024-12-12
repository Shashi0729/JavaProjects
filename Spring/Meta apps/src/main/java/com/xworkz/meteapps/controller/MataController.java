package com.xworkz.meteapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.meteapps.dto.MetaDto;

import com.xworkz.meteapps.service.MetaServiceImpl;


@Component
@RequestMapping("/")
public class MataController {
	
	
	@Autowired
	private MetaServiceImpl service;
	@GetMapping("/submit")
	public String save(@ModelAttribute MetaDto dto,Model model) {
		
		System.out.println(dto);
		model.addAttribute("save", dto);
		String result = service.Onsave(dto);
		System.out.println(result);
		return "success";
	}


}
