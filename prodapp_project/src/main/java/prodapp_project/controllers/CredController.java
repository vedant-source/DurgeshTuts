package prodapp_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import prodapp_project.dao.SignUpDao;
import prodapp_project.dto.SignUp;

@Controller
public class CredController {

	@Autowired
	SignUpDao signUpDao;

	@RequestMapping("/")
	public String showHomePage(Model m) {
		System.out.println("/ cont login page.....!!!!!!!");
		return "login";
	}

	@RequestMapping("/signUpCont")
	public String showsignUpPage(Model m) {
		System.out.println("Redirected to sign up page");
		return "signup";
	}

	@RequestMapping(path = "/processSignUpForm", method = RequestMethod.POST)
	public String processSignUpForm(@ModelAttribute("user") SignUp user) {
		System.out.println("processSignUpForm handler Worked");
		// System.out.println(user);
		signUpDao.saveCreds(user);
		System.out.println("Record fetched via /processSignUpForm --------" );
		return "login";
	}

	@RequestMapping("/logInCreds")
	public String logInCreds(@RequestParam("email") String email, @RequestParam("password") String pass,Model model) {
		System.out.println("/logInCreds handler worked...!!!");
		System.out.println("/logInCreds ----  " + email + " : " + pass);
		//String err="";
		SignUp record = signUpDao.getSingleRecord(email);

		System.out.println("Record fetched via Dao layer --------" + record);
		
		try {
			if (email.equals(record.getEmail()) && pass.equals(record.getPassword())) {
				
				return "redirect:/home";
			}
		} catch (Exception e) {
			model.addAttribute("errmsg", "Invalid Credentials");
			return "login";
		}

		return "";
	}

	@RequestMapping("/forgotpassword")
	public String showForgotPasswordPage() {
		return "forgotpassword";
	}

	
	@RequestMapping("/verifyEmail")
	public String verifyEmailFromForgotPasswordPage(@RequestParam("email") String email, Model model) {

		SignUp record = signUpDao.getSingleRecord(email);
		model.addAttribute("creds", record);
		System.out.println("Record fetched via /processSignUpForm --------" + record);
		try {
			if (record.getEmail().equals(email)) {
				System.out.println("Valid Mail For Retrival of PASSWORD.....");
				return "showpassword";
			}
		} catch (Exception e) {
			// TODO: handle exception
			return "forgotpassword";
		}
		return "";
	}

}
