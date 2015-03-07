package gov.trasport.online.employee.controller;

import gov.trasport.online.employee.model.Employee;
import gov.trasport.online.employee.service.EmployeeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author Rajasekhar Burepalli
 *
 */
@Controller
public class EmployeeAddController {
	
	@Autowired
	@Qualifier(value="empManager")
	private EmployeeManager employeeManager;
	public EmployeeManager getEmployeeManager() {
		return employeeManager;
	}
	
	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	

	@RequestMapping("/showEmployeeForm")
	public ModelAndView getEmployeeForm(){
		System.out.println("showEmployeeForm:");
		ModelAndView mv = new ModelAndView("employeeAdd");
		mv.addObject("employeeEntity", new Employee());
		return mv;
	}

	@RequestMapping("/updateEmployeeForm")
	public ModelAndView getUpdateEmployeeForm(){
		System.out.println("updateEmployeeForm:");
		ModelAndView mv = new ModelAndView("employeeUpdate");
		mv.addObject("employeeEntity", new Employee());
		return mv;
	}
	

	@RequestMapping("/deleteEmployeeForm")
	public ModelAndView getDeleteEmployeeForm(){
		System.out.println("deleteEmployeeForm:");
		ModelAndView mv = new ModelAndView("employeeDelete");
		mv.addObject("employeeEntity", new Employee());
		return mv;
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee e){
		System.out.println("addEmployee:");
		ModelAndView mv = new ModelAndView("employeeList");
		
		//EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.addEmployee(e);
		setStatusRepo(employeeManager.getStatus());
		System.out.println("Report status:"+statusRepo);
		mv.addObject("employeeList", employeeManager.getEmployeeList());
        mv.addObject("result", employeeManager.getStatus());
		return mv;
	}
	
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee e){
		System.out.println("updateEmployee is calling:========:");
		ModelAndView mv = new ModelAndView("employeeList");
		
		//EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.updateEmployee(e);
		setStatusRepo(employeeManager.getStatus());
		System.out.println("Report status:"+statusRepo);
		mv.addObject("employeeList", employeeManager.getEmployeeList());
        mv.addObject("result", employeeManager.getStatus());
		return mv;
	}
	

	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@ModelAttribute Employee e){
		System.out.println("deleteEmployee is calling:========:");
		ModelAndView mv = new ModelAndView("employeeList");
		
		//EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.deleteEmployee(e);
		setStatusRepo(employeeManager.getStatus());
		System.out.println("Report status:"+statusRepo);
		mv.addObject("employeeList", employeeManager.getEmployeeList());
        mv.addObject("result", employeeManager.getStatus());
		return mv;
	}
	
	private String statusRepo;
	/**
	 * @return the statusRepo
	 */
	public String getStatusRepo() {
		return statusRepo;
	}

	/**
	 * @param statusRepo the statusRepo to set
	 */
	public void setStatusRepo(String statusRepo) {
		this.statusRepo = statusRepo;
	}
	
}
