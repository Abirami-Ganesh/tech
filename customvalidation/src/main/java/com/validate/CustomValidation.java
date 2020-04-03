package com.validate;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegisterBean;
@Component
public class CustomValidation implements Validator{

	
	public void validate(Object obj, Errors error) {
		
		RegisterBean registorBean=(RegisterBean)obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(error,"userName","error.userName","User Name cannot be blank");
		long phone=registorBean.getContactNumber();
		String str=String.valueOf(phone);
		if(!(str.length()==10))
		{
			error.rejectValue("contactNumber","error.contactNumber","Conatact Number should be of 10 digits/ Contact Number should not be blank");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(error,"emailId","error.emailId","Email ID cannot be blank");
		
	
	}	 	  	    	    	     	      	 	

	public boolean supports(Class<?> arg0) {
		
		return false;
	}
	

}
