package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.RegisterBean;
import com.validate.*;
@Controller
@ComponentScan("com.validate")
public class RegisterController {
	@Autowired
	private CustomValidation custValidator;
	@RequestMapping(value="/registerPage",method=RequestMethod.GET)
	public String registerPage(@ModelAttribute("register") RegisterBean registerBean,BindingResult result)
	{
		 return "register";
	}
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public String performRegistration (@ModelAttribute("register") RegisterBean  registrationBean, 
			BindingResult result) {
		
				custValidator.validate(registrationBean, result);
				if(result.hasErrors())
				{
            	return "register";
				}
				return "response";
	
	
	}	 	  		    	    	     	      	 	
}
