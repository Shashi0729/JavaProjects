package com.xworkz.project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.project.dto.IndustryDto;
import com.xworkz.project.repo.IndustryRepo;
import com.xworkz.project.service.IndustryService;


@Component
@RequestMapping("/")
public class IndustryController {
	

	@Autowired
	IndustryService service;
	@Autowired
	IndustryRepo repo;

	@PostMapping("/IndustrySignup")
	public String save(@ModelAttribute IndustryDto dto, Model model) {
		model.addAttribute("save", dto);
		service.onSave(dto);
		return "IndustrySignin";

	}

	

	@GetMapping("/Industryupdate")
	public String update(@RequestParam String email, Model model) {
		IndustryDto dto = service.findByEmail(email);
		model.addAttribute("dto", dto);
		return "edit";

	}

	@PostMapping("/Industryupdate")
	public String updateDetails(@ModelAttribute IndustryDto dto, Model model) {
		System.out.println(dto);
		if (service.updateByEmail(dto)) {
			model.addAttribute("update", service.updateByEmail(dto));

			return "home";

		}
		return "edit";

	}

	@GetMapping("/Industrydelete")
	public String delete(@RequestParam String email, Model model) {
		IndustryDto dto = service.findByEmail(email);
		service.deleteByEmail(dto);
		model.addAttribute("dto", dto);
		return "signin";
	}


	
	@PostMapping("/IndustrysOTPverification")
	public String otpVerification(@RequestParam("email") String email, @RequestParam("otp") int otp, Model model) {
		boolean result = service.validateOTP(otp, email);
		if(result) {
			model.addAttribute("email", email);		
			return "resetpassword";
		}
		
		return "resetpasswordOTPsending";

	}
	
	@GetMapping("/IndustryRegister")
	public String register() {
		return "IndustryRegister";
	}
	
	
	@GetMapping("/IndustrySignin")
	public String signIn() {
		return "IndustrySignin";
	}

}
