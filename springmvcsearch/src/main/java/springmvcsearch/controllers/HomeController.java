package springmvcsearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Controller Worked...!!!");
	return ("home");	
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		System.out.println("Search Controller Worked...!!!");
		RedirectView redirectView = new RedirectView();
		
		String url = "https://www.google.com/search?q="+query;
		
		System.out.println("https://www.google.com/search?q="+query);
		redirectView.setUrl(url);
		return redirectView;
	}
	
}
