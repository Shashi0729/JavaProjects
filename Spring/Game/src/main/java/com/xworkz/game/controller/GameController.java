package com.xworkz.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.game.dto.GameDto;
import com.xworkz.game.service.GameService;
@Component
@RequestMapping("/")

public class GameController {
	
	@Autowired
	private GameService service;
	@GetMapping("/submit")
	public String save(@ModelAttribute GameDto dto,Model model) {
		
		dto.setCreatedOn(java.time.LocalDateTime.now());
		System.out.println(dto);
		model.addAttribute("save", dto);
		String result = service.onSave(dto);
		System.out.println(result);
		return "success";
	}

}
