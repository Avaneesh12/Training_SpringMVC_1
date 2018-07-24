package com.cg.training.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.training.beans.Trainee;
import com.cg.training.service.TraineeService;

@Controller
public class TraineeApplicationController {
	
	@Autowired
	TraineeService traineeService;
/*	
	public int generateEmployeeID()
	{
		double rndDouble = Math.random();
		return (int) (rndDouble * 1000);
	}
*/	
	@RequestMapping(value="/returnTrainee")
	public ModelAndView registeremployee(@RequestParam("username") String username, @RequestParam("password") String password, Trainee trainee,BindingResult result) {
		/*try {
			if(result.hasErrors()) return new ModelAndView("loginpage");

		} catch (Exception e) {
			e.printStackTrace();
		}

*/

//		return new ModelAndView("loginSuccessPage","trainee",trainee);
		
		if(username.equals("admin") && password.equals("admin"))
			{return new ModelAndView("loginSuccessPage");}
		else
			{return new ModelAndView("errorPage");}
	}
	
	@RequestMapping(value="/addingTrainee")
	public ModelAndView addTrainee(@ModelAttribute("trainee") Trainee trainee,BindingResult result) {
		try {
			if(result.hasErrors()) return new ModelAndView("errorPage");
			//employee.setEmployeeID(employeeID);
			trainee=traineeService.addTrainee(trainee);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("addSuccessPage","trainee",trainee);
	}
	@RequestMapping(value="/deletingTrainee")
	public ModelAndView deleteTrainee(@ModelAttribute("trainee") Trainee trainee,BindingResult result) {
		
			if(result.hasErrors()) return new ModelAndView("errorPage");
			
			trainee=traineeService.removeTrainee(trainee);
		
		

		return new ModelAndView("removePage","trainee",trainee);
	}

}
