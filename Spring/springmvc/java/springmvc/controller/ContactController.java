package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		// this is common for all so we use here and use @ModelAttribute
		model.addAttribute("Header" , "Sign Up Form ");
		model.addAttribute("Desc", "Home for Programmer");
System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header" , "Sign Up Form ");
//		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("Creating form");
		return "contact";
	}
	
	
	// Model  Attribute
	@RequestMapping(path= "/processform" , method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) 
	{	
		// to see the data in console
		System.out.println( user);
			
		// Redirect in spring MVC
		if(user.getUserName().isBlank()) {
		return "redirect:/contact";	
		}
		
		
		// process (to show the data in browser)

	//	model.addAttribute("Header" , "Sign Up Form ");
	//	model.addAttribute("Desc", "Home for Programmer");

		model.addAttribute("user",user);
		System.out.println("Form  Submitted");
	    int createdUser= this.userService.createUser(user);
		model.addAttribute("msg", "User created with id " + createdUser);
		return "success";
	}
}
/*@ModelAttribute
 *  1) ModelAttribute is used to fetch the data of form  and make the object user
   means fetching the data means the work done by RequestParam and then make the object user and then the data set through model
2) we have to use it in the parameter of handler
3) We have to use it as a method level for adding common data
*/
/*
 

	@RequestMapping(path= "/processform" , method=RequestMethod.POST)
	public String handleForm(@RequestParam(name= "email" ,  required=true) String userEmail , // Parameter using this annotation are required by default(true) but you can specify that a parameter is optional by setting @RequiredParam's required attribute to false.
			@RequestParam("userName") String userName ,
			@RequestParam("password") String userPassword , Model model) // bcoz of Model we can see the userName userEmail and password on our browser with the help of success.jsp page
	{
	
		/*String email = request.getParameter("email");
	    System.out.println("User email is "+ email);*/ // this is old method /*HttpServletRequest request*/
		
		// to see the data in console
	/*	System.out.println("user email " + userEmail);
		System.out.println("user name " + userName);
		System.out.println("user password " + userPassword);
		
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		// process (to show the data in browser)
//		model.addAttribute("name" , userName );
//		model.addAttribute("email" , userEmail );
//		model.addAttribute("password" , userPassword);
		
		model.addAttribute("user",user);
		return "success";
	}
	// with the help of model attribute we can reduce the line of code.
	
}

*/














