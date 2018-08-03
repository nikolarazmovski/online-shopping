package org.app.onlineshopping.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("greeting", "Welcome to Spring Web MVDC");
		return mv;

	}
	
	//COMMENTED CODE BELOW JUST FOR EDUCATIONAL PUPROSES LIKE CRAIG FOR BETH (FUCK YEA) NOT FOR THE ACTUAL PROJECT	

//	@RequestMapping(value = "/test")
//	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) { // this method is used for you to mandatory pass a value for greeting in the url unless you set the require to false!!!
//		if(greeting == null)
//			greeting = "Hello Fuckers!!!";
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		
//		return mv;
//	}
	
//	@RequestMapping(value = "/test/{greeting}") // dynamic greting without question mark in the url just pass a string under /test/carp-you-want-to-say !!
//	public ModelAndView test(@PathVariable("greeting") String greeting) { // this method is used for you to mandatory pass a value for greeting in the url unless you set the require to false!!!
//		if(greeting == null) // in this method you can't have default method because it won't load if you don't specify name
//			greeting = "Hello Fuckers!!!";
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		
//		return mv;
//	}
}
