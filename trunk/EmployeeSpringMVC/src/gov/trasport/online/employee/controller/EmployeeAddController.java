package gov.trasport.online.employee.controller;

import gov.trasport.online.employee.model.Employee;
import gov.trasport.online.employee.service.EmployeeManager;
import gov.trasport.online.user.login.controller.UserLoginController;

import org.apache.log4j.Logger;
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
	static Logger logger = Logger.getLogger(UserLoginController.class);
	@Autowired
	@Qualifier(value = "empManager")
	private EmployeeManager employeeManager;

	public EmployeeManager getEmployeeManager() {
		return employeeManager;
	}

	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	@RequestMapping("/showEmployeeForm")
	public ModelAndView getEmployeeForm() {
		logger.info("showEmployeeForm:getEmployeeForm strted ");
		ModelAndView mv = new ModelAndView("employeeAdd");
		mv.addObject("employeeEntity", new Employee());
		logger.info("showEmployeeForm:getEmployeeForm ended ");
		return mv;
	}

	@RequestMapping("/updateEmployeeForm")
	public ModelAndView getUpdateEmployeeForm() {
		logger.info("updateEmployeeForm:getUpdateEmployeeForm started ");
		ModelAndView mv = new ModelAndView("employeeUpdate");
		mv.addObject("employeeEntity", new Employee());
		logger.info("updateEmployeeForm:getUpdateEmployeeForm ended ");
		return mv;
	}

	@RequestMapping("/deleteEmployeeForm")
	public ModelAndView getDeleteEmployeeForm() {
		logger.info("deleteEmployeeForm:getDeleteEmployeeForm started ");
		ModelAndView mv = new ModelAndView("employeeDelete");
		mv.addObject("employeeEntity", new Employee());
		logger.info("deleteEmployeeForm:getDeleteEmployeeForm ended ");
		return mv;
	}

	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee e) {
		logger.info("addEmployee:addEmployee started ");
		ModelAndView mv = new ModelAndView("employeeList");

		// EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.addEmployee(e);
		setStatusRepo(employeeManager.getStatus());
		logger.info("Report status:" + statusRepo);
		mv.addObject("employeeList", employeeManager.getEmployeeList());
		mv.addObject("result", employeeManager.getStatus());
		logger.info("addEmployee:addEmployee ended ");
		return mv;
	}

	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee e) {
		logger.info("updateEmployee:updateEmployee started ");
		ModelAndView mv = new ModelAndView("employeeList");

		// EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.updateEmployee(e);
		setStatusRepo(employeeManager.getStatus());
		logger.info("Report status:" + statusRepo);
		mv.addObject("employeeList", employeeManager.getEmployeeList());
		mv.addObject("result", employeeManager.getStatus());
		logger.info("updateEmployee:updateEmployee ended ");
		return mv;
	}

	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@ModelAttribute Employee e) {
		logger.info("deleteEmployee:deleteEmployee started ");
		ModelAndView mv = new ModelAndView("employeeList");

		// EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.deleteEmployee(e);
		setStatusRepo(employeeManager.getStatus());
		logger.info("Report status:" + statusRepo);
		mv.addObject("employeeList", employeeManager.getEmployeeList());
		mv.addObject("result", employeeManager.getStatus());
		logger.info("deleteEmployee:deleteEmployee ended ");
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
	 * @param statusRepo
	 *            the statusRepo to set
	 */
	public void setStatusRepo(String statusRepo) {
		this.statusRepo = statusRepo;
	}

}
