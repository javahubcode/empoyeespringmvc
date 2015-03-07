/**
 * 
 */
package gov.trasport.online.user.dao.template;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import gov.trasport.online.login.dao.LoginDAO;
import gov.trasport.online.login.model.UserLogin;

/**
 * @author Rajasekhar Burepalli
 *
 */
public class LoginJDBCTemplate implements LoginDAO {

	/**
	 * 
	 */
	public LoginJDBCTemplate() {
		// TODO Auto-generated constructor stub
	}

	public String validateUser(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean createUser(UserLogin loginModel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(UserLogin loginModel) {
		// TODO Auto-generated method stub
		return false;
	}
	private DataSource dataSource;
	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	/**
	 * @return the transactionManager
	 */
	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}

	/**
	 * @param transactionManager the transactionManager to set
	 */
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
}
