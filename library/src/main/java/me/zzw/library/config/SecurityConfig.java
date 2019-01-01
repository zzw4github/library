package me.zzw.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import me.zzw.library.auth.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)  //  启用方法级别的权限认证
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
    @Override
    public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService();
    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
//            .antMatchers("/", "/home", "/boot","/query").permitAll()
        	  .antMatchers("/*","/es/*").permitAll()
            .anyRequest().authenticated()  // 其他地址的访问均需验证权限
            .and()
        .formLogin()
            .loginPage("/login")
            .failureUrl("/login-error.html").permitAll()
            .permitAll()
            .and()
        .logout()
            .permitAll();
	}
	
	@Override
	     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	         auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
	     }
	
}
