package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.AdoptClass;
import com.example.demo.services.AdoptService;
import com.example.demo.services.UploadService;


@Controller
public class AdoptController {
	
	@Autowired
	private AdoptService adoptService;
	@Autowired
	private UploadService uploadService;
	
	@GetMapping("/showAdopt")
	public String showAdopt(@RequestParam ("owner_id") int owner_id,
			@RequestParam("pet_name") String pet_name,
			@RequestParam int pet_id,
			Model model) {
		model.addAttribute("owner_id",owner_id);
		model.addAttribute("pet_name",pet_name);
		model.addAttribute("pet_id",pet_id);
		return "adopt_form";
	}
	
	@PostMapping("/adoptProcess")
	public String adoptProcess(AdoptClass adopts) {
		System.out.println("adopted");
		adoptService.adoptProcess(adopts);
		return "adoptSuccess";	
	}
	
	@GetMapping("/notifications")
	public String notifications(@RequestParam("user_id") int owner_id, Model model) {
	    List<AdoptClass> viewNotifications = adoptService.notifications(owner_id);

	    
	    if (viewNotifications.isEmpty()) {
	        model.addAttribute("noNotificationsMessage", "You currently have no notifications.");
	    } else {
	        model.addAttribute("viewNotifications", viewNotifications);
	    }

	    return "notifications_view_page";
	}


	
	
	@PostMapping("/acceptRequest")
    public String adoptionAccept(@RequestParam("pet_id") int pet_id) {
        System.out.println("deleted adopted pet");
        uploadService.deletePetById(pet_id);
        adoptService.deleteById(pet_id);
        return "notifications_view_page";
    }
}
