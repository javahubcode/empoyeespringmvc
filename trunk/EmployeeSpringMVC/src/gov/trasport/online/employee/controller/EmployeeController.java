package gov.trasport.online.employee.controller;

import gov.trasport.online.employee.service.EmployeeManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Rajasekhar Burepalli
 *
 */
@Controller
public class EmployeeController {
	@Autowired
	@Qualifier(value="empManager")
	private EmployeeManager employeeManager;
	public EmployeeManager getEmployeeManager() {
		return employeeManager;
	}
	
	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	
	
	@RequestMapping("/employee")
	public ModelAndView addEmployee(){
		System.out.println("addEmployee:");
		ModelAndView mv = new ModelAndView("employeeList");
		mv.addObject("employeeList", this.employeeManager.getEmployeeList());
		return mv;
	}
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("in EmployeeController");

		ModelAndView mv = new ModelAndView("employeeList");
		mv.addObject("employeeList", this.employeeManager.getEmployeeList());

		return mv;
	}
}
