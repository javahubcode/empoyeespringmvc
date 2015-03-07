/**
 * 
 */
package gov.trasport.online.login.dao;

import gov.trasport.online.login.model.UserLogin;

/**
 * @author abc
 *
 */
public interface LoginDAO {
	public String validateUser(String userName,String password);
	public boolean createUser(UserLogin loginModel);
	public boolean updateUser(UserLogin loginModel);

}
