package com.sathya.security.Service;

import com.sathya.security.Entites.User;

public interface UserService {
	
	public User insertUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(Integer id);

}
