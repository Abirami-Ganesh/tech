package com.bean;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Register {
	@NotBlank(message = "is required")
	private String username;
	@Size(min = 1)
	private String password;
	@NotNull(message = "is required")
	@Email(message = "enter correct email format")
	private String email;
	@NotEmpty(message = "is required")
	private String address;
	@NotNull
	@Min(18)
	@Max(40)
	private Integer age;
	@NotNull(message = "is required")
	private String gender;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@Past(message = "Please Enter correct birthday")
	private Date dob;
	@Size(min = 1)
	private String location;
	@NotNull
	@Size(min = 1)
	private List<String> language;

	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public Date getDob() {
		return dob;
	}

	public String getLocation() {
		return location;
	}

}
