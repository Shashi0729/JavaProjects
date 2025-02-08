package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.dto.UserDetailsDto;
import com.project.service.ProjectService;
@Component
@RequestMapping("/")
public class ProjectController {
@Autowired
ProjectService service;
@PostMapping("/SignupSubmit")
public String save(@ModelAttribute UserDetailsDto dto,Model model) {
	model.addAttribute("save",dto);
	service.onsave(dto);
	return "signin";
}
}
