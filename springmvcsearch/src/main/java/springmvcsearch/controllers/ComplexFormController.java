package springmvcsearch.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

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
		
//		if(result.hasErrors()) {
//			return "complex_form";
//		}
//		
//			  if (student.getId() instanceof Long) {
//			          return null;
//			        } 
				
//			String str = null;
//		System.out.println(str.length());
	
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String numberFormatExceptionHandler(Model m) {
		m.addAttribute("msg", "Oops you have got Number Format Exception...!!!");
		return "excepPage";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String nullPointerExceptionHandler(Model m) {
		m.addAttribute("msg", "Oops you have got Exception...!!!");
		return "excepPage";
	}

	
}
