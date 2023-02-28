package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	 
	@RequestMapping("/contact")
				public String contact() {
				System.out.println("Contact Controller Worked...!!!");
					return "contact";
	}
	
//             WAY 1
//	@RequestMapping(path = "/processForm", method = RequestMethod.POST )
//	public String handleForm(HttpServletRequest request) {
//		
//		String email = request.getParameter("email");
//		String username = request.getParameter("username");
//		
//		System.out.println("Email : "+email);
//		System.out.println("Username : "+username);
//		
//		return "success";
//	}
	
	
//  WAY 2
	@RequestMapping(path = "/processForm", method = RequestMethod.POST )
	public String handleForm(@RequestParam("email") String mail, @RequestParam("username") String usernm, 
			@RequestParam("password") String pass , Model model) {
			
				System.out.println("Email :"+mail);
				System.out.println("User_Name :"+usernm);
				System.out.println("Password :"+pass);
		
				model.addAttribute("mail", mail);
				model.addAttribute("usernm", usernm);
				model.addAttribute("pass", pass);
				
				return "success";
	}
}
