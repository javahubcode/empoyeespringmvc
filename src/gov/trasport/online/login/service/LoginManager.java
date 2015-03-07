/**
 * 
 */
package gov.trasport.online.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import gov.trasport.online.user.dao.template.LoginJDBCTemplate;

/**
 * @author abc
 *
 */
public class LoginManager {

	/**
	 * 
	 */
	@Autowired
	@Qualifier(value = "loginTemplate")
	private LoginJDBCTemplate loginTemplate;

	/**
	 * @return the loginTemplate
	 */
	public LoginJDBCTemplate getLoginTemplate() {
		return loginTemplate;
	}

	/**
	 * @param loginTemplate
	 *            the loginTemplate to set
	 */
	public void setLoginTemplate(LoginJDBCTemplate loginTemplate) {
		this.loginTemplate = loginTemplate;
	}

	public LoginManager() {
		// TODO Auto-generated constructor stub

	}

}
