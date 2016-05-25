package com.acn.yrs.dao;

import java.util.List;

import com.acn.yrs.domain.UserInfo;

public interface UserInfoDao {

	public UserInfo addUser(UserInfo userInfo);
	public UserInfo updateUser(UserInfo userInfo);
	public UserInfo getUserbyId(String userId);
	public List<UserInfo> getUsers();

}
