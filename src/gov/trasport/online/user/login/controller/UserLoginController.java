/**
 * 
 */
package gov.trasport.online.user.login.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gov.trasport.online.login.model.UserLogin;
import gov.trasport.online.service.UserManager;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Rajasekhar Burpalli
 *
 */
@Controller
public class UserLoginController {
	static Logger logger = Logger.getLogger(UserLoginController.class);
	@Autowired
	@Qualifier(value = "userManager")
	@Value("${question1}")
	private String question1;
	@Value("${question2}")
	private String question2;
	@Value("${question3}")
	private String question3;

	/**
	 * 
	 */
	public UserLoginController() {
		// TODO Auto-generated constructor stub

	}

	@Autowired
	@Qualifier(value = "userManager")
	UserManager userManager;

	/**
	 * @return the userManager
	 */
	public UserManager getUserManager() {
		return userManager;
	}

	/**
	 * @param userManager
	 *            the userManager to set
	 */
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@RequestMapping("/loginGateway")
	public ModelAndView displayLoginGatewayForm() {
		logger.info("displayLoginGatewayFrom is called ");
		ModelAndView mv = new ModelAndView("UserLogin");
		mv.addObject("loginEntity", new UserLogin());
		logger.info("displayLoginGatewayFrom is ended ");
		return mv;
	}
	
	@RequestMapping("/index")
	public ModelAndView  displayIndex(){
		logger.info("displayindexjsp page is called ");
		ModelAndView mv= new ModelAndView("index");
		return mv;
		
	}

	@RequestMapping("/validateUserLoginAndPostData")
	public ModelAndView validateUserLogin(@ModelAttribute UserLogin e) {
		logger.info("validateUserLogin is called ");
		logger.info("=====Username:" + e.getUserName() + "====password:"
				+ e.getPassword());

		
		ModelAndView mv = new ModelAndView("userRegistrationStatus");
		mv.addObject("loginEntity", new UserLogin());
		// pass model object to the service layer
		
		logger.info("validateUserLogin ended");
		return mv;
	}

	// @RequestMapping("/userRegistrationGateway")
	// public ModelAndView userRegistrationGatewayForm(){
	// System.out.println("userRegistrationGateway");
	// ModelAndView mv = new ModelAndView("userRegistrationForm");
	// mv.addObject("loginEntity", new UserLogin());
	// System.out.println("=====");
	// return mv;
	// }

	@RequestMapping("/userRegistrationGateway")
	public String viewRegistration(Map<String, Object> model) {
		logger.info("viewRegistration started");
		UserLogin userLoginModel = new UserLogin();
		model.put("loginEntity", userLoginModel);
		// Questions Tags Here
		Map<String, String> securityQuestionsList = new HashMap<String, String>();
		securityQuestionsList.put("1", question1);
		securityQuestionsList.put("2", question2);
		securityQuestionsList.put("3", question3);
		// Questions
		model.put("securityQuestionsList", securityQuestionsList);
		// mv.addObject("loginEntity", new UserLogin());
		logger.info("viewRegistration ended");
		return "userRegistrationForm";
	}

	@RequestMapping("/userHelp")
	public ModelAndView userHellp() {
		logger.info("userHellp started");
		ModelAndView mv = new ModelAndView("userHelp");
		mv.addObject("loginEntity", new UserLogin());
		logger.info("userHellp ended");
		return mv;
	}

}
