package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		 System.out.println("This is Contact Controller");
		 
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("password") String password,
			Model model
			) {
		System.out.println("name" +userName);
		System.out.println("email " +userEmail);
		System.out.println("password" +password);
		
		model.addAttribute("password", password);
		model.addAttribute("username", userName);
		model.addAttribute("email", userEmail);
		return "success";
	}
	
}
