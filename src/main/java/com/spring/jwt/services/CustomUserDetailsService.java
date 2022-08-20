package com.spring.jwt.services;
import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		if (userName.equals("Prashant Sir")) {
			return new User(username:"Prashant Sir", password:"Ashutosh", new ArrayList<>());
						
		}else {
			throw new UsernameNotFoundException ("user not found !!");
		}
	}

}
