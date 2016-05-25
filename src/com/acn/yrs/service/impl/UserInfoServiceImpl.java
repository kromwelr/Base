package com.acn.yrs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acn.yrs.dao.UserInfoDao;
import com.acn.yrs.domain.UserInfo;
import com.acn.yrs.service.UserInfoService;

@Service("UserInfoService")
@Transactional
public class UserInfoServiceImpl implements UserInfoService {


	@Autowired
	private UserInfoDao userInfoDao;
	@Override
	public UserInfo getUserInfoById(String userId) {
		return userInfoDao.getUserbyId(userId);
	}
	/**
	 * @return the userInfoDao
	 */
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	/**
	 * @param userInfoDao the userInfoDao to set
	 */
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	@Override
	public List<UserInfo> getUsers() {

		return userInfoDao.getUsers();
	}

}
