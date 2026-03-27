package com.example.demo.cv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private final CvProfileService cvProfileService;

	public HomeController(CvProfileService cvProfileService) {
		this.cvProfileService = cvProfileService;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("profile", cvProfileService.getProfile());
		return "home";
	}
}
