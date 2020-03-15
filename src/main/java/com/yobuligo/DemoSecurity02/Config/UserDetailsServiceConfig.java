package com.yobuligo.DemoSecurity02.Config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yobuligo.DemoSecurity02.User.IUserRepository;

@Configuration
public class UserDetailsServiceConfig {

	@Bean
	public UserDetailsService userDetailsService(final IUserRepository userRepository) {
		return username -> userRepository
				.findOneByLogin(username)
				.map(entity -> new User(
					entity.getLogin(),
					entity.getHashedPassword(), 
					// Ihre Rollen hier
					new ArrayList<>()))
				.orElseThrow(() -> 
					new UsernameNotFoundException(username)
				);
	}
	
}
