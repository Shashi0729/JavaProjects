package com.xworkz.tvshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.tvshow.dto.TvShowDto;
import com.xworkz.tvshow.service.TvShowService;
import com.xworkz.tvshow.service.TvShowServiceImpl;

@Component
@RequestMapping("/")
public class TvShowController {
	
	@Autowired
	private TvShowServiceImpl service;
	@GetMapping("/submit")
	public String save(@ModelAttribute TvShowDto dto,Model model) {
		
		dto.setCreatedOn(java.time.LocalDateTime.now());
		System.out.println(dto);
		model.addAttribute("save", dto);
		String result = service.Onsave(dto);
		System.out.println(result);
		return "success";
	}

}
