package me.zzw.library.es.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.zzw.library.es.dao.UsersRepository;
import me.zzw.library.es.io.Users;


@RestController
@RequestMapping("es")
public class UsersController {
	@Autowired
	private UsersRepository usersRepository;
	
	@RequestMapping("add")
	public String add() {
		Users user = new Users();
		user.setId("1");
		user.setEnabled(true);
		user.setUsername("zhaoziwen");
		user.setPassword("zhaoziwen");
		usersRepository.save(user);
		return "success";
		
	}
	
	  /**
     * 删除
     * @return
     */
    @RequestMapping("delete")
    public String delete() {
        Users users = usersRepository.queryUserById("1");
       usersRepository.delete(users);
        return "success";
    }
 
    /**
     * 局部更新
     * @return
     */
    @RequestMapping("update")
    public String update() {
        Users users = usersRepository.queryUserById("1");
        users.setPassword("xxxxxx");
        usersRepository.save(users);
        System.err.println("update a obj");
        return "success";
    }
    /**
     * 查询
     * @return
     */
    @RequestMapping("query")
    public Users query() {
        Users accountInfo = usersRepository.queryUserById("1");
        System.err.println(accountInfo);
        return accountInfo;
    }

}
