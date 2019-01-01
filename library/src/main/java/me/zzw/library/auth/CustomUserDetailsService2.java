package me.zzw.library.auth;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import me.zzw.library.auth.dto.Login;
import me.zzw.library.auth.service.LoginService;
import me.zzw.library.auth.service.RoleService;


//@Component
public class CustomUserDetailsService2 implements UserDetailsService {
	@Autowired
	private LoginService loginService;

	@Autowired
	private RoleService roleService;

	/**
	 * 1 用什么查数据 mybatis 自己拼装sql， spring-security 有实现吗 retrieveUser(String
	 * username,UsernamePasswordAuthenticationToken authentication) 2 查哪些表 3
	 * 怎么把数据封装成spring-security user类
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (StringUtils.isEmpty(username)) {
			throw new UsernameNotFoundException("用户名为空");
		}

//		Users users = loginService.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("用户不存在"));

//		Set<GrantedAuthority> authorities = new HashSet<>();
//		roleService.getRoles(users.getUsername()).forEach(r -> authorities.add(new SimpleGrantedAuthority(r.getName())));
//
//		return new org.springframework.security.core.userdetails.User(username, users.getPassword(), true, // 是否可用
//				true, // 是否过期
//				true, // 证书不过期为true
//				true, // 账户未锁定为true
//				authorities);
		return null;
	}

}
