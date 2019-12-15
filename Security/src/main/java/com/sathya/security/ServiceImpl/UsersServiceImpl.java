package com.sathya.security.ServiceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.Data.UserRepository;
import com.sathya.security.Entites.User;
import com.sathya.security.Service.UserService;
@Service
public class UsersServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Transactional
	@Override
	public User insertUser(User user) {
		return userRepository.save(user);
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
