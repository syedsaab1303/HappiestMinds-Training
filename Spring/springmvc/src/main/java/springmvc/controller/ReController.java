package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
// In this page we learn  about redirect

//redirect in spring MVC which has 3 ways

@Controller
public class ReController {

	// 1) redirect prefix
	@RequestMapping("/one")
	public String one() { // for working this handler we use requestmapping
		System.out.println("This is one handler");
		return "redirect:/two"; // this is called relative url // this is the way of redirecting
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("this is second handler");
		return "contact";
	}

   //2) RedirectView	
	@RequestMapping("/three")
	public RedirectView three() {
		System.out.println("This is second way which is RedirectView");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");  // this is relative URL and /two this is absolute URL
		
		return redirectView;
	}

}
