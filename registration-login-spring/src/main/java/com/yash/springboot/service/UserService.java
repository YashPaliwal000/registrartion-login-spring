package com.yash.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.yash.springboot.entity.User;
import com.yash.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
}
