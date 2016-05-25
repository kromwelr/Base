package com.acn.yrs.service;

import java.util.List;

import com.acn.yrs.domain.UserInfo;

public interface UserInfoService {

	public UserInfo getUserInfoById(String userId);

	public List<UserInfo> getUsers();
}
