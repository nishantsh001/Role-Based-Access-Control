package com.roleBasedAccessControl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults; 

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity)throws Exception{
		httpSecurity.authorizeHttpRequests((requests)->requests.anyRequest().authenticated());
		httpSecurity.formLogin(withDefaults());
		//httpSecurity.httpBasic((withDefaults()));
		return httpSecurity.build();
	}
}
