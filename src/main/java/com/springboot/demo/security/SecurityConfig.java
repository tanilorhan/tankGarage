package com.springboot.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
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
		http = http.csrf().disable();
		return http.authorizeHttpRequests()
				.requestMatchers("/listTanks").authenticated()
				.requestMatchers("/tank/*").authenticated()
//				.requestMatchers("listTanks").authenticated()
				.anyRequest().permitAll()
				.and().formLogin().loginPage("/login")
				.and().logout().logoutSuccessUrl("/")
				.and().build();

	}

}
