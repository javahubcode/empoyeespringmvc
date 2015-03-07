/**
 * 
 */
package gov.trasport.online.login.model;

import java.util.List;

/**
 * @author Rajasekhar Burepalli
 *
 */
public class UserLogin {

	/**
	 * 
	 */
	public UserLogin() {
		// TODO Auto-generated constructor stub
	
	}
	private String userName;
	private String password;
	private String gender  = "M";
	/**
	 * @return the dOB
	 */
	public String getDOB() {
		return DOB;
	}
	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	private String DOB;
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	private String address1;
	private String address2;
	private String phoneNumber;
	private String officePhoneNumber;
	private String emailId;
	private String recoveryEmailId;
	private String securityAnswer;
	private String securityQuestions;
	
	/** Address1 refers to the present address
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**Address2 refers to the permanent address
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the officePhoneNumber
	 */
	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}
	/**
	 * @param officePhoneNumber the officePhoneNumber to set
	 */
	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the recoveryEmailId
	 */
	public String getRecoveryEmailId() {
		return recoveryEmailId;
	}
	/**
	 * @param recoveryEmailId the recoveryEmailId to set
	 */
	public void setRecoveryEmailId(String recoveryEmailId) {
		this.recoveryEmailId = recoveryEmailId;
	}
	/**
	 * @return the securityAnswer
	 */
	public String getSecurityAnswer() {
		System.out.println("getSecurityAnswer securityAnswer initializing ======="+securityAnswer);
		return securityAnswer;
	}
	/**
	 * @param securityAnswer the securityAnswer to set
	 */
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
		System.out.println("setting securityAnswer initializing ======="+securityAnswer);
	}
	/**
	 * @return the securityQuestions
	 */
	public String getSecurityQuestions() {
		//securityQuestions.add("Which Company You worked previously?");
		System.out.println("getting securityQuestions initializing ======="+securityQuestions);
		return securityQuestions;
	}
	/**
	 * @param securityQuestions the securityQuestions to set
	 */
	public void setSecurityQuestions(String securityQuestions) {
		
		this.securityQuestions = securityQuestions;
		System.out.println("setting securityQuestions initializing ======="+securityQuestions);
	}

}
