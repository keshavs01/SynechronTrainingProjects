package com.synechron.car_rental;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("india").password("{noop}india").roles("user");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic().and().csrf().disable();
		
//		http.authorizeRequests().antMatchers("*/*.html").permitAll()
//		.antMatchers("/api/v1/cibilscore")
//		.authenticated()
//		.and().formLogin()
//		.and().logout()
//		.logoutSuccessUrl("/api/v1/cibilscore")
//		.invalidateHttpSession(true)
//		.deleteCookies("JSESSIONID").and().csrf().disable();
		
		
		//FORM AUTHENTICATION
//		http.authorizeRequests()
//		.anyRequest()
//		.authenticated()
//		.and().formLogin()
//		.and().logout()
//		.logoutSuccessUrl("/api/v1/cibilscore")
//		.invalidateHttpSession(true)
//		.deleteCookies("JSESSIONID")
//		.and().csrf().disable();

	}

}
