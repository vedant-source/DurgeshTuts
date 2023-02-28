package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
//	way1 : Redirecting Using Prefix

//	@RequestMapping("/one")
//	public String one() {
//			System.out.println("Handler One is working...!!!");
//			return "redirect:/two";
//		}
//	
//	@RequestMapping("/two")
//	public String two() {
//			System.out.println("Handler Two is working...!!!");
//			return "redirectionSuccess";
//		}
	
	//way2 :
	
	@RequestMapping("/one")
	public RedirectView one() {
			System.out.println("Handler One is working...!!!");
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("two");
			return redirectView;
		}
	
	@RequestMapping("/two")
	public String two() {
			System.out.println("Handler Two is working...!!!");
			return "redirectionSuccess";
		}
	
	
}
