package com.ibm.training.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Service {

	
	@Autowired
	Dao dao;
	
	
	public String getUser(int id) {
		return dao.getUser(id);
		
	}


	public void addUser(User user) {
		dao.addUSer(user);
		
	}


	public void updateUser(String id,String field,String value) {
		dao.updateUser(id,field,value);
		
	}


	public void deleteUser(String id) {
		dao.deleteUser(id);
		
	}

}
