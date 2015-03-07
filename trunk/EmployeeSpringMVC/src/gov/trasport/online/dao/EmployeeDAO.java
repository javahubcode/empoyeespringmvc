package gov.trasport.online.dao;

/**
 * @author Rajasekhar Burepalli
 *
 */
import gov.trasport.online.employee.model.Employee;

import java.util.List;

public interface EmployeeDAO {
public List<Employee> getAllEmployeeList();
public Employee getEmploeeById(String empId);
public boolean saveOrUpdateEmployeeData(Employee e,String action);
public boolean deleteEmployeeData(Employee e);

}
