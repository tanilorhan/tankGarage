package com.springboot.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEnconder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService(UserRepository userRepository) {
		return userName -> {
			User user = userRepository.findByUsernameAndDeletedFalse(userName);
			if (user != null) {
				return user;
			}
			throw new UsernameNotFoundException("");
		};
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
//				.cors().and().csrf().disable()
				.authorizeHttpRequests()
//				.requestMatchers("/","/**").permitAll()
//				.and().authorizeHttpRequests()
//				.requestMatchers("/registration","/listTanks").anonymous()
//				.requestMatchers("/login").permitAll()
//				.requestMatchers("/registration").permitAll()
//				.requestMatchers("/listTanks").permitAll()
//				.and().authorizeHttpRequests()
//				.anyRequest().authenticated()
				.anyRequest().permitAll()
				.and().build();

	}

}
