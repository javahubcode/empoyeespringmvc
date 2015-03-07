/**
 * 
 */
package gov.trasport.online.dao.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import gov.trasport.online.employee.dao.EmployeeDAO;
import gov.trasport.online.employee.model.Employee;
import gov.trasport.online.employee.model.mapper.EmployeeRowMapper;

/**
 * @author Rajasekhar Burepalli
 *
 */
public class EmployeeJDBCTemplate implements EmployeeDAO {

	/**
	 * 
	 */
	public EmployeeJDBCTemplate() {
		// TODO Auto-generated constructor stub
	}

	private String resultStaus;

	/**
	 * @return the resultStaus
	 */
	public String getResultStaus() {
		return resultStaus;
	}

	/**
	 * @param resultStaus
	 *            the resultStaus to set
	 */
	public void setResultStaus(String resultStaus) {
		this.resultStaus = resultStaus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.trasport.online.employee.dao.EmployeeDAO#getAllEmployeeList()
	 */
	public List<Employee> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.trasport.online.employee.dao.EmployeeDAO#getEmploeeById(java.lang
	 * .String)
	 */
	public Employee getEmploeeById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.trasport.online.employee.dao.EmployeeDAO#saveOrUpdateEmployeeData
	 * (gov.trasport.online.employee.model.Employee)
	 */
	public boolean saveOrUpdateEmployeeData(Employee e, String action) {
		// TODO Auto-generated method stub
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);

		String SQL = null;
		int i=0;
		if (e != null) {
			if (action.equals("update")) {
				try {
					String updateStatement = " UPDATE employee"
							+ " SET ename=?, dno=?" + " WHERE eno=?";
				 i=jdbcTemplateObject
							.update(updateStatement,
									new Object[] { e.getEname(), e.getDno(),
											e.getEno() });
					System.out.println("empoyee updation status:"+i);
					
				} catch (Exception ex) {
					System.out
							.println("=====Excpetion while updating the employee :"
									+ ex.getMessage() + "===GetCause: "
									+ ex.getCause());
					ex.printStackTrace();
					setResultStaus("<font color='red'> ERROR: Employee updation :) "
							+ ex.getCause().toString() + "</font>");
					return false;
				}
				if(i==0)
					setResultStaus("<font color='blue'>Employee not matched... Please verify Criteria</font>");
				else
					setResultStaus("<font color='green'>Employee updated successfully!...</font>");
				return true;
			} else {
				SQL = "insert into employee (eno, ename,dno) values (?, ?,?)";
				try {
					jdbcTemplateObject.update(SQL, e.getEno(), e.getEname(),
							e.getDno());
					System.out.println("Created Record Name = " + e.getEname()
							+ " eno = " + e.getEno());
					transactionManager.commit(status);
				} catch (Exception ex) {
					System.out
							.println("=====Excpetion while storing :"
									+ ex.getMessage() + "===GetCause: "
									+ ex.getCause());
					ex.printStackTrace();
					transactionManager.rollback(status);
					setResultStaus("<font color='red'> ERROR: Employee insertion :) "
							+ ex.getCause().toString() + "</font>");
					return false;
				}

			}
			setResultStaus("<font color='green'>Employee inserted successfully!...</font>");
			return true;
		}
		setResultStaus("<font color='yellow'>Failed!...</font>");
		return false;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.trasport.online.employee.dao.EmployeeDAO#deleteEmployeeData(gov.trasport
	 * .online.employee.model.Employee)
	 */
	public boolean deleteEmployeeData(Employee e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				TransactionDefinition def = new DefaultTransactionDefinition();
				TransactionStatus status = transactionManager.getTransaction(def);

				String SQL = null;
				int i=0;
				if (e != null) { {
						SQL = "delete from employee where eno=?";
						try {
							i=jdbcTemplateObject.update(SQL, e.getEno());
							System.out.println("Deleted Record Name = " + e.getEname()
									+ " eno = " + e.getEno());
							transactionManager.commit(status);
						} catch (Exception ex) {
							System.out
									.println("=====Excpetion while deleting :"
											+ ex.getMessage() + "===GetCause: "
											+ ex.getCause());
							ex.printStackTrace();
							setResultStaus("<font color='red'> ERROR: Employee deletion :) "
									+ ex.getCause().toString() + "</font>");
							return false;
						}

					}
				if(i==0)
					setResultStaus("<font color='blue'>Employee not matched for deletion... Please verify Criteria</font>");
				else
					setResultStaus("<font color='green'>Employee Deleted successfully!...</font>");
				return true;
					
				}
				setResultStaus("<font color='yellow'>Failed!...</font>");
				return false;

	}

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	private JdbcTemplate jdbcTemplateObject;

	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(
			PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	private PlatformTransactionManager transactionManager;

	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM Employee";
		List<Employee> customers = new ArrayList<Employee>();
		List<Map<String, Object>> rows = jdbcTemplateObject.queryForList(sql);
		for (Map row : rows) {
			Employee employee = new Employee();
			employee.setEno((String) (row.get("ENO")));
			employee.setEname((String) (row.get("ENAME")));
			employee.setDno((String) (row.get("DNO")));
			customers.add(employee);
		}
		return customers;
	}
}
