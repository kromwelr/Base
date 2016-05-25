package com.acn.yrs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.acn.yrs.base.AbstractDao;
import com.acn.yrs.dao.UserInfoDao;
import com.acn.yrs.domain.UserInfo;

@Repository("userInfoDao")
public class UserInfoDaoImpl extends AbstractDao<UserInfo> implements UserInfoDao {

	@Override
	public Criteria createCriteria() {
		return createCriteria(UserInfo.class);
	}

	@Override
	public UserInfo addUser(UserInfo userInfo) {
		return save(userInfo);
	}

	@Override
	public UserInfo updateUser(UserInfo userInfo) {
		update(userInfo);
		return userInfo;
	}

	@Override
	public UserInfo getUserbyId(String userId) {
		Criteria criteria = createCriteria();
		criteria.add(Restrictions.eq("userId", userId));
		return (UserInfo) criteria.uniqueResult();
	}

	@Override
	public List<UserInfo> getUsers() {

		Criteria criteria = createCriteria();
		return criteria.list();
	}

}
