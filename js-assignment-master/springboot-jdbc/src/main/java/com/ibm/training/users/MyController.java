package com.ibm.training.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {

	@Autowired
	Service service;
	
	
	
	@RequestMapping("/getusers/{id}")
	String getUser(@PathVariable int id) {
		return service.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/useradd")
	void addUser(@RequestBody User user) {

		service.addUser(user);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/userupdate/{id}/{field}/{value}")
	void addUser(@PathVariable String id,@PathVariable String field,@PathVariable String value) {

		service.updateUser(id,field,value);

	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/userdelete/{id}")
	void addUser(@PathVariable String id) {

		service.deleteUser(id);

	}
}
	
	

