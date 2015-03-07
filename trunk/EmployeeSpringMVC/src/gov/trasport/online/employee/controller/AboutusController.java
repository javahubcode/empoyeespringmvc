package gov.trasport.online.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Rajasekhar Burepalli
 *
 */
@Controller
public class AboutusController {

	String message = "Welcome to Spring MVC!";

	@RequestMapping("/aboutus")
	public ModelAndView showMessage() {
		System.out.println("in HelloWorldController");

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		
		return mv;
	}

}
