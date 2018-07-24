package com.cg.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.training.beans.Trainee;

@Controller
public class URIController 
{
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "indexPage";
	}

	@RequestMapping(value="/login")
	public String getLoginPage() {
		return "loginpage";
	}
	@RequestMapping(value="/loginSuccessPage")
	public String getLoginSuccessPage() {
		return "loginSuccessPage";
	}
	@RequestMapping(value="/add")
	public String addPage() {
		return "addPage";
	}
	@ModelAttribute("trainee")
	public Trainee getTrainee() {
		return new Trainee();
	}
}
