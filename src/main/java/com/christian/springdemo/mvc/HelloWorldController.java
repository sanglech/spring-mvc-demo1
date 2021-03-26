package com.christian.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//add a new contorller method to add form data
	// add data to method
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter form the HTML form
		String theName = request.getParameter("studentName");

		
		
		// convert the data to all caps
		String result ="YO! "+ theName.toUpperCase();
		
		// create message
		model.addAttribute("message",result);
		
		// add message to the model
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// convert the data to all caps
		String result ="Hello from v3 "+ theName.toUpperCase();
		
		// create message
		model.addAttribute("message",result);
		
		// add message to the model
		return "helloworld";
	}
	
}
