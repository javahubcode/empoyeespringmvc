/**
 * 
 */
package gov.trasport.online.employee.model.mapper;

import gov.trasport.online.employee.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author abc
 * @param <T>
 *
 */
public class EmployeeRowMapper implements RowMapper {

	/**
	 * 
	 */
	public EmployeeRowMapper() {
		// TODO Auto-generated constructor stub
	}

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEno(rs.getString("ENO"));
		employee.setEname(rs.getString("ENAME"));
		employee.setDno(rs.getString("DNO"));
		return employee;
	}
	
}
