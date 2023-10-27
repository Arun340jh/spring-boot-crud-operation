package springmvc.controller;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println("Hello");
		model.addAttribute("name","Arun");
		model.addAttribute("id",1321);
		
		List<String>friends = new ArrayList<String>();
		friends.add("shyam");
		friends.add("dhyam");
		friends.add("suraj");
		friends.add("well");
		model.addAttribute("f", friends);
		
		return "index";
		
	}
		
		
	
		
		@RequestMapping("about")
	public String about() {
	
	System.out.println("this is a constructor");
	
	return "about";
	}
 @RequestMapping("/help")
  public ModelAndView ModelAndViewhelp() {
	  System.out.println("this is wrong");
	  
	  // creating model and view object
	  ModelAndView modelAndView = new ModelAndView();
	  // setting the data
	  
	  modelAndView.addObject("name", "hariom");
	  modelAndView.addObject("rollnumber",53654);
	  LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
	  
	  //marks
	  List<Integer> list= new ArrayList<Integer>();
	  list.add(5464);
	  list.add(5565);
	  list.add(89789);
	  list.add(5631);
	  modelAndView.addObject("marks",list);
	  
	  
	  
	  //setting the view name
	  modelAndView.setViewName("help");
	return modelAndView;
  }
		
}


