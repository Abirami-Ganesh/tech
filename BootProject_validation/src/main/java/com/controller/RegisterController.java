package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Register;

@Controller
public class RegisterController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showform(Model model) {
		model.addAttribute("register", new Register());
		return "home";

	}

	@RequestMapping(value = "/processform", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("register") Register register, BindingResult result) {
		if (result.hasErrors())
			return "home";
		else
			return "success";

		
	}
}
