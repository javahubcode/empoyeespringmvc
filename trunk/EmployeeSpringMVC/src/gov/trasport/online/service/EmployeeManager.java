package gov.trasport.online.service;

import gov.trasport.online.employee.dao.template.EmployeeJDBCTemplate;
import gov.trasport.online.employee.model.Employee;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeManager {
	private static List<Employee> employeeList;

	@Autowired
	@Qualifier(value = "employeeTemplate")
	EmployeeJDBCTemplate employeeJDBCTemplate;

	public EmployeeJDBCTemplate getEmployeeJDBCTemplate() {
		return employeeJDBCTemplate;
	}

	public void setEmployeeJDBCTemplate(
			EmployeeJDBCTemplate employeeJDBCTemplate) {
		this.employeeJDBCTemplate = employeeJDBCTemplate;
	}

	public EmployeeManager() {

		employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Mike", "Smith"));
		employeeList.add(new Employee(2, "John", "Taylor"));
		employeeList.add(new Employee(3, "Dave", "Wilson"));
	}

	public List<Employee> getEmployeeList() {
		return getEmployeeListShow();
	}
	private String status;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Employee> addEmployee(Employee e) {
		// Employee employee = new Employee();
		List<Employee> employee = null;
		Employee e1 = new Employee();
		employeeJDBCTemplate.saveOrUpdateEmployeeData(e,"save");
		setStatus(employeeJDBCTemplate.getResultStaus());
		employee = employeeJDBCTemplate.getAllEmployees();
		// employee.setId(employeeList.size()+1);
		// employee.setFirstName(e.getFirstName());
		// employee.setLastName(e.getLastName());
		for (Employee emp : employee) {
			e1.setEno(emp.getEno());
			e1.setEname(emp.getEname());
			e1.setDno(emp.getDno());
			employeeList.add(e1);
		}

		return employee;
	}
	
	public List<Employee> getEmployeeListShow()
	{		
		List<Employee> empList=new ArrayList<Employee>();
		List<Employee> employee = null;
		
		employee = employeeJDBCTemplate.getAllEmployees();
		for (Employee emp : employee) {
			Employee e1 = new Employee();
			System.out.println("Eno:"+emp.getEno());
			e1.setEno(emp.getEno());
			e1.setEname(emp.getEname());
			System.out.println("Ename:"+emp.getEname());
			e1.setDno(emp.getDno());
			System.out.println("dno:"+emp.getDno());
			empList.add(e1);
		}
		return empList;
		
		
	}


	public List<Employee> updateEmployee(Employee e) {
		// Employee employee = new Employee();
		List<Employee> employee = null;
		Employee e1 = new Employee();
		employeeJDBCTemplate.saveOrUpdateEmployeeData(e,"update");
		setStatus(employeeJDBCTemplate.getResultStaus());
		employee = employeeJDBCTemplate.getAllEmployees();
		for (Employee emp : employee) {
			e1.setEno(emp.getEno());
			e1.setEname(emp.getEname());
			e1.setDno(emp.getDno());
			employeeList.add(e1);
		}

		return employee;
	}
	public List<Employee> deleteEmployee(Employee e) {
		// Employee employee = new Employee();
		List<Employee> employee = null;
		Employee e1 = new Employee();
		employeeJDBCTemplate.deleteEmployeeData(e);
		setStatus(employeeJDBCTemplate.getResultStaus());
		employee = employeeJDBCTemplate.getAllEmployees();
		for (Employee emp : employee) {
			e1.setEno(emp.getEno());
			e1.setEname(emp.getEname());
			e1.setDno(emp.getDno());
			employeeList.add(e1);
		}

		return employee;
	}

}
