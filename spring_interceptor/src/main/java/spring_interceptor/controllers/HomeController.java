package spring_interceptor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homepage() {
		System.out.println("homepage handler worked...");
		return "home";
	}

	@RequestMapping("/welcome")
	public String handleForm(@RequestParam("userName") String name, Model model) {
		System.out.println("handleForm handler worked...");
		System.out.println("welcome controller :"+name);
		model.addAttribute("name", name);
		return "commonsuccess";
	}

}
