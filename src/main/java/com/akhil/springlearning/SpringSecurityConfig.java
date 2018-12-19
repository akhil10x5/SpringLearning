package com.akhil.springlearning;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@EnableWebSecurity
//@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{
	
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		 * You can also simply prefix {noop} to your passwords in order for the DelegatingPasswordEncoder 
		 * use the NoOpPasswordEncoder to validate these passwords. Notice that NoOpPasswordEncoder is deprecated though, 
		 * as it is not a good practice to store passwords in plain text.
		 
		
		auth.inMemoryAuthentication().withUser("test").password("{noop}test").roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.authorizeRequests().anyRequest().permitAll().and().httpBasic();
	}*/
}
