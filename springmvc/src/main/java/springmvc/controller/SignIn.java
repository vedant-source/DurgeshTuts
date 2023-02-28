package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.dto.User;
import springmvc.service.UserService;

@Controller
public class SignIn {
	@Autowired
	private UserService userService;
	
		@RequestMapping("/signIn")
		public String cred() {
			System.out.println("signIn Controller worked...!!!");
			return "signInPage";
		}
		
		@ModelAttribute
		public void common(Model model) {
			model.addAttribute("trt", "SignIn Successful...!!!!!");
		}
		
		@RequestMapping(path = "/processSignIn", method = RequestMethod.POST )
		public String handleSignIn(@ModelAttribute("user") User user, Model model) {
		//model.addAttribute("trt", "SignIn Successful...!!!!!");
			System.out.println("processSignIn working...");
			
			if(user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
				System.out.println("isEmpty() condition is TRUE..!!!");
				return "redirect:/signIn";
			}
			
			userService.createUser(user);
			System.out.println(user);
			return "signInSuccessPage";
		}
}
