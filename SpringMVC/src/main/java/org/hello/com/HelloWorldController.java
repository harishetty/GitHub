package org.hello.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayhello(ModelMap model){
			
		model.addAttribute("message", "hello wolrd");
		return "hello";
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
    public String sayhello1(ModelMap model){
		
 		model.addAttribute("message", "hello wolrd sandeep");
		return "hello";
		
	}
	
	@RequestMapping(value="/message1",method=RequestMethod.GET)
    public String message(ModelMap model){
		
 		model.addAttribute("message", "hello wolrd sandeep get oppurtunity");
		return "hello";
		
	}

}
