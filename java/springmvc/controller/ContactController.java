package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commanDataForModel(Model m) {
		m.addAttribute("Header","Spring MVC");
		System.out.println(m);
		
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
	
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {


		// process
		/*
		 * model.addAttribute("password", password); model.addAttribute("username",
		 * userName); model.addAttribute("email", userEmail);
		 */
	

		return "success";
	}

}

/*
 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
 * handleForm(@RequestParam("email") String userEmail,
 * 
 * @RequestParam("username") String userName,
 * 
 * @RequestParam("password") String password, Model model ) {
 * 
 * User user=new User(); user.setEmail(userEmail); user.setPassword(password);
 * user.setUsername(userName);
 * 
 * 
 * System.out.println(user);
 * 
 * //process
 * 
 * model.addAttribute("password", password); model.addAttribute("username",
 * userName); model.addAttribute("email", userEmail);
 * 
 * model.addAttribute("user", user);
 * 
 * return "success"; }
 * 
 */