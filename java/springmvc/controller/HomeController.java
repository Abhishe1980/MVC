package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	

	public HomeController() {
		super();
		System.out.println("HomeController Started..");
	}

//	@RequestMapping("/home")
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Abhishek Tiwari");
		model.addAttribute("id",6123);
		List<String> friends=new ArrayList<String>();
		friends.add("Ankit");
		friends.add("Yogesh");
		friends.add("Kishan");
		
		model.addAttribute("f",friends);
      System.out.println("This is Our Home Page");
		
		return"index";
		
	}

	@RequestMapping("/about")
	public String about() {
		
		System.out.println("This is our About Controller");
		return"about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		 
	System.out.println("This is Help COntroller");	
	
	//Creating ModelAndView Object
	ModelAndView modelAndView=new ModelAndView();
	
	//Setting the Data
	modelAndView.addObject("name", "Kishan");
	modelAndView.addObject("rollnumber", 28384);
	LocalDateTime now=LocalDateTime.now();
	modelAndView.addObject("time", now);
	
	//Marks
	List<Integer> list=new ArrayList<Integer>();
	list.add(123);
	list.add(29834);
	list.add(24745);
	
	modelAndView.addObject("marks", list);
	
	//Setting View Name
	modelAndView.setViewName("help");
	
		return modelAndView;
	}
	
}
