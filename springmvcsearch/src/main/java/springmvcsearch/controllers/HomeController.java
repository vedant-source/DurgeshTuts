package springmvcsearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Controller Worked...!!!");
//		String str = null;
//		System.out.println(str.length());
		return ("home");
	}

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId , @PathVariable("userName") String userName) {
		System.out.println(userId);
		System.out.println(userName);
		return "commonsuccess";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		System.out.println("Search Controller Worked...!!!");
		RedirectView redirectView = new RedirectView();

		String url = "https://www.google.com/search?q=" + query;

		System.out.println("https://www.google.com/search?q=" + query);
		redirectView.setUrl(url);
		return redirectView;
	}
	
//	@ExceptionHandler(value = NumberFormatException.class)
//	public String numberFormatExceptionHandler(Model m) {
//		m.addAttribute("msg", "Oops you have got Number Format Exception...!!!");
//		return "excepPage";
//	}
//	@ExceptionHandler(value = NullPointerException.class)
//	public String nullPointerExceptionHandler(Model m) {
//		m.addAttribute("msg", "Oops you have got Null Pointer Exception...!!!");
//		return "excepPage";
//	}

}
