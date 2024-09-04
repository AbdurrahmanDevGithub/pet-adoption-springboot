package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.UploadClass;
import com.example.demo.services.UploadService;

@Controller
public class UploadController {
	
	@GetMapping("/showUpload")
	public String showUploadPets(@RequestParam ("user_id") int id ,Model model) {
		System.out.println("showed upload page");
		model.addAttribute("id",id);
		return "upload_form";
	}
	
	
	@Autowired
	private UploadService uploadService;
	
	@PostMapping("/upload")
	public String uploadPets(UploadClass uploads,Model model) {
		System.out.println("uploaded");
		
		uploadService.uploadPets(uploads);
		return "redirect:/view";
	}
	
	@GetMapping("/view")
	public String viewPets(Model model) {
		List<UploadClass> petList= uploadService.viewPets();
		model.addAttribute("petList",petList);
		return "view";
	}
}
