package me.zzw.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.zzw.library.dao.UsersMapper;
import me.zzw.library.pojo.Users;
import me.zzw.library.service.HelloService;



@Service
public class HelloServiceImpl implements HelloService{
	@Autowired
	UsersMapper usersMapper;
	
	public Integer save() {
		Users users = new Users();
		users.setEnabled(true);
		users.setPassword("zhaoziwen");
		users.setUsername("zhaoziwen");
		return usersMapper.insert(users);
		
	}
}
