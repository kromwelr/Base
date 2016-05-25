package com.acn.yrs.domain;

import java.util.Date;

public class UserInfo {

	private String userId;
	private String nm;
	private int userGroup;
	private String password;
	private String sessionId;
	private String email;
	private Date upDt;
	private Date birthday;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the nm
	 */
	public String getNm() {
		return nm;
	}

	/**
	 * @param nm
	 *            the nm to set
	 */
	public void setNm(String nm) {
		this.nm = nm;
	}

	/**
	 * @return the userGroup
	 */
	public int getUserGroup() {
		return userGroup;
	}

	/**
	 * @param userGroup
	 *            the userGroup to set
	 */
	public void setUserGroup(int userGroup) {
		this.userGroup = userGroup;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId
	 *            the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the upDt
	 */
	public Date getUpDt() {
		return upDt;
	}

	/**
	 * @param upDt
	 *            the upDt to set
	 */
	public void setUpDt(Date upDt) {
		this.upDt = upDt;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
