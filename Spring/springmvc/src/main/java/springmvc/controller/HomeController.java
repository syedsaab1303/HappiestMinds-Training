package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Create Controller
@Controller   // this is annotation based controller so  we have to enable it through spring configuration in spring-servlet.xml file
 @RequestMapping("/demo") // Note:- we use @RequestMapping on entire class also 
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET) // this home will run when we fire /home. 
	public String home(Model model) // we use Model object for getting data dynamically 
	{
		System.out.println("Hello this is home url");
		model.addAttribute("name", "Syed Tamzeed" );
		model.addAttribute("id", 9450 );
		
		List<String> friends= new ArrayList<String>();
		friends.add("Praveen");
		friends.add("Hashim");
		
		model.addAttribute( "f" , friends);
		return "index";
	}
// views page means index.jsp


@RequestMapping("/about")  // kis url se mapping krna chahte hai
public String about() {
	System.out.println("This is  about page in console");
	return  "about";
}



// services help

@RequestMapping("/service")
public String services() {
	System.out.println("This is service page");
	return "serviced";
}


@RequestMapping("/help")
public ModelAndView help() {
	System.out.println("This is help controller page");
	
	//creating model and view object
	ModelAndView modelAndView = new ModelAndView();
	
	//setting the data
	modelAndView.addObject("name" , "Syed");
	modelAndView.addObject("rollnumber", 9450);
	LocalDateTime now= LocalDateTime.now();
	modelAndView.addObject("time", now);
	
	//marks
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	modelAndView.addObject("marks", list);
	
	
	// setting the view name
	modelAndView.setViewName("help");
	
	return modelAndView;
}



}
