package com.service;

import org.springframework.stereotype.Service;

import com.bean.LoginBean;
@Service
public class LoginService {
public boolean loginValidate(LoginBean login)
{
	if(login.getUsername().equals(login.getPassword()))
		return true;
	else
		return false;
}
}
