package gov.trasport.online.service;

import gov.trasport.online.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserManager {

	public UserManager() {
		// TODO Auto-generated constructor stub
		
	}

	@Autowired
	@Qualifier(value = "userRegistrationDAOTemplate")
	UserDAO userDAOTemplate;

	/**
	 * @return the userDAOTemplate
	 */
	public UserDAO getUserDAOTemplate() {
		return userDAOTemplate;
	}

	/**
	 * @param userDAOTemplate the userDAOTemplate to set
	 */
	public void setUserDAOTemplate(UserDAO userDAOTemplate) {
		this.userDAOTemplate = userDAOTemplate;
	}


}
