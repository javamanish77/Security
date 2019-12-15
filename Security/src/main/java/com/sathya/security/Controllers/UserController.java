package com.sathya.security.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.Entites.User;
import com.sathya.security.Service.UserService;

@RestController
@RequestMapping(path="/User")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping(path="/addUser")
	public User insertUser(User user) {
		return userService.insertUser(user);
	}
	
	@PutMapping(path="/updateUser")
	public User updateUser(User user) {
		return userService.updateUser(user);
	}
		
	@DeleteMapping(path="/deleteUser")
	public void deleteUser(Integer id) {
		userService.deleteUser(id);
	}
}
