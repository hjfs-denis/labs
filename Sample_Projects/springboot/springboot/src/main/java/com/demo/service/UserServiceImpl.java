package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repo.UserRepo;
import com.demo.entity.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userDAO;
    @Override
	public List<User> getAllUsers() {
        return userDAO.findAll();
    }
    @Override
	public User addUser(User user) {
        return userDAO.save(user);
    }
    @Override
	public Optional<User> getUserById(int id) {
    	return userDAO.findById(id);
    }
    @Override
	public User updateUser(User user) {
       return userDAO.saveAndFlush(user);
    }
    @Override
	public void deleteUserById(int id) {   
    	this.userDAO.deleteById(id);
    }
    @Override
	public void deleteAllUsers() {
    	this.userDAO.deleteAll();
    }
}