package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	

	public HomeController() {
		super();
		System.out.println("HomeController Started..");
	}

//	@RequestMapping("/home")
	@GetMapping("/home")
	public String home() {
      System.out.println("This is Our Home Page");
		
		return"index";
		
	}

	@RequestMapping("/about")
	public String about() {
		
		System.out.println("This is our About Controler");
		return"about";
	}
	
}
