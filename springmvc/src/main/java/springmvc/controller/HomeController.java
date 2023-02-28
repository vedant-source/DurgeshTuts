package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first")
public class HomeController {
 
	@RequestMapping("/")
	public String home(Model model)
	{
		System.out.println("Home Controller Working...!!!");
		model.addAttribute("name", "Vedant Palwankar");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Baji");
		friends.add("Mandar");
		friends.add("Chima");
		
		model.addAttribute("frds", friends);
		return "index";
	}
	
	
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String about() 
	{
		System.out.println("About Controller Working...!!!");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("help controller working ...!!!");
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		modelAndView.addObject("heading", "How may I help you ?");
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(80);
		marks.add(90);
		marks.add(100);
		marks.add(65);
		
		modelAndView.addObject("markList", marks);
		
		
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	
	
}
