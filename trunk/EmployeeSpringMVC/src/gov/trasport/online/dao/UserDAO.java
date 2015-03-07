package gov.trasport.online.dao;

import gov.trasport.online.login.model.UserLogin;

public interface UserDAO {

	public boolean createUser(UserLogin userLogin);

}
