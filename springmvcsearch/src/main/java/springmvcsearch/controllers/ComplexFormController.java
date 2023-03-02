package springmvcsearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.dto.Student;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("complex handler worked...!!!");
			return "complex_form";
		}
	
	@RequestMapping(path = "/handleform" , method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {	 
		
		if(result.hasErrors()) {
			return "complex_form";
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}
}
