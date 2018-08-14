package org.app.onlineshopping.contoller;

import org.app.shoppingbackend.dao.CategoryDAO;
import org.app.shoppingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "Home");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
		
		

	}
	
	@RequestMapping(value = { "/about" })
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "About");
		mv.addObject("userClickAbout",true);
		return mv;

	}
	

	
	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "Contact Us");
		
		mv.addObject("userClickContact",true);
		return mv;

	}
	
	//Methods to load all the products based on category
	
	@RequestMapping(value = { "/show/all/products" })
	public ModelAndView showAllProducts() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickViewProducts",true);
		return mv;

	}
	
	
	@RequestMapping(value = { "/show/category/{id}/products" })
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) { //@PathVariable gets the value form the {id} in the request mapping

		ModelAndView mv = new ModelAndView("page");

		//categoryDAO to fetch single category
		Category category = null;
		
		category = categoryDAO.get(id);
		mv.addObject("title", category.getName());
		
		mv.addObject("categories", categoryDAO.list());
		//passing a single category objects
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts",true);
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
