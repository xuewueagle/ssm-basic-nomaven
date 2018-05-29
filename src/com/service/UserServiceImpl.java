package com.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.mapper.UserMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource
	public UserMapper userMapper;

	@Override
	public String findUserAge(String id) {
		String age =userMapper.findAge(id);
		return age;
	}

}
