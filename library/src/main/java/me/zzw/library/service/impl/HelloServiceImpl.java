package me.zzw.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import me.zzw.library.service.HelloService;



@Service
public class HelloServiceImpl implements HelloService{
	@Autowired
//	UsersMapper usersMapper;
	
	public Integer save() {
//		Users users = new Users();
//		users.setEnabled(true);
//		users.setPassword("zhaoziwen1");
//		users.setUsername("zhaoziwen1");
//		return usersMapper.insert(users);
		return 1;
		
	}
	
//	public Users selectByID() {
//		return usersMapper.selectByPrimaryKey("zhaoziwen1");
//		return null;
		
//	}
}
