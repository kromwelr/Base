package com.acn.yrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acn.yrs.domain.UserInfo;
import com.acn.yrs.service.UserInfoService;

@RestController
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

	@RequestMapping(value="/users", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<UserInfo> getUsers() {
		return userInfoService.getUsers();
	}

}
