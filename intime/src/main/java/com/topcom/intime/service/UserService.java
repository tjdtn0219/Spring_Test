package com.topcom.intime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.topcom.intime.model.User;
import com.topcom.intime.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User findUser(String username) {
		
		User user = userRepository.findByUsername(username)
				.orElseGet(()->{
					return new User();
				});
		return user;
	}
	
	@Transactional
	public void modify(int id, User requestUser) {
		User user = userRepository.findById(id)
				.orElseThrow(()->{
					return new IllegalArgumentException("유저 찾기 실패");
				});
		user.setUsername(requestUser.getUsername());
	}
}
