package com.employee.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeViewController {
	
	@RequestMapping("/index")
	public String getMainPage() {
       
    	return "welcome";

    }

}
