package me.zzw.library.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomUserDetailsService implements UserDetailsService {
	private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
	@Autowired
	PasswordEncoder passwordEncoder;
	@Override

	/** * 根据用户名获取用户 - 用户的角色、权限等信息 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		UserDetails userDetails = null;
//		try {
//			me.zzw.library.pojo.User user = new me.zzw.library.pojo.User();
//			user.setUsername("zhaoziwen");
//			user.setPassword("zhaoziwen");
//			Collection<GrantedAuthority> authList = getAuthorities();
//			String pwdString = passwordEncoder.encode(user.getPassword().toLowerCase());
//			userDetails = new User(username, pwdString, true, true, true, true, authList);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return null;
	}

	/** * 获取用户的角色权限,为了降低实验的难度，这里去掉了根据用户名获取角色的步骤 * @param * @return */
	private Collection<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		return authList;
	}

}
