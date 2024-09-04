package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.AdoptClass;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;


@Controller
public class LoginController {
	@Autowired
	private UserRepository userRepo;
	

	@GetMapping("/")
	public String log() {
        return "loginPage";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user",new User());
		return "signup_Form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		System.out.println("aslk;as"+user.getUserimage());
		userRepo.save(user);
		return "loginPage";
	}
	
	@GetMapping("/showLoginPage")
	public String showLoginForm() {
        return "loginPage";
	}
	
	@PostMapping("/home")
    public String processLogin(@RequestParam("email") String email, 
                               @RequestParam("password") String password,Model model) {
        User user = userRepo.findByEmail(email);
        
        if (user != null && user.getPassword().equals(password)) {
        	model.addAttribute("user",user);
            return "home";
        } else {
            return "loginPage";
        }
	}
	
	
}
