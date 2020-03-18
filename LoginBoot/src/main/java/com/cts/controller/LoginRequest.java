package com.cts.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.LoginBean;
import com.service.LoginService;

@Controller
public class LoginRequest {
	@Autowired
	private LoginService service;
	@RequestMapping(value="/login" , method=RequestMethod.GET )
	public String checkHome(@ModelAttribute("login") LoginBean login)
	{
		return "login";
	}
	@RequestMapping(value="/loginsubmit",method=RequestMethod.POST)
	public String checkLogin(@ModelAttribute("login") LoginBean login,BindingResult result )
	{
		if(result.hasErrors())
		return "login";
		else if(service.loginValidate(login))
			return "success";
		else
			return "fail";
	}

}
