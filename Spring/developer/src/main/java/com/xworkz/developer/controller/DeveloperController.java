package com.xworkz.developer.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.developer.dto.DeveloperDto;
import com.xworkz.developer.service.DeveloperService;

@Component
@RequestMapping("/")
public class DeveloperController {
	@Autowired
	private DeveloperService service;

	@PostMapping("/submit")
	public String save(@ModelAttribute @Valid DeveloperDto dto, Model model, BindingResult result) {
		System.out.println(dto);
		Set<ConstraintViolation<DeveloperDto>> violation = service.onSave(dto);
		if (violation.isEmpty()) {
			return "success";
		}
		model.addAttribute("violation", violation);
		return "index";
	}

	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("view", service.findall());
		return "view";

	}
	
	@GetMapping("/search")
	public String getByDeveloperName(@RequestParam String developerName, Model model) {
		System.out.println("developer name:" + developerName);
		List<DeveloperDto> listOfDto = service.getByDeveloperName(developerName);
		System.out.println(listOfDto);
		model.addAttribute("list", listOfDto);
		return "search";
		
	}

	@GetMapping("/update")
	public String search(@RequestParam int id, Model model) {
		DeveloperDto dto = service.findbyId(id);
		model.addAttribute("update", dto);
		return "update";

	}

	@PostMapping("/update")
	public String update(@ModelAttribute DeveloperDto dto, Model model) {
        boolean result =service.update(dto);
        model.addAttribute("search", result);
		return "search";
		
	}
	
	@GetMapping("/delete")
	public String delete(@ModelAttribute DeveloperDto dto, Model model) {
        boolean result =service.delete(dto);
        model.addAttribute("search", result);
		return "search";
		
	}
}
