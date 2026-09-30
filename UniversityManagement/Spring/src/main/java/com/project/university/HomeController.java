package com.project.university;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class HomeController {
	
	//---------------------------admin login--------------------------
	
	@GetMapping("/{id}/{password}")
	public User m3(@PathVariable String id,@PathVariable String password) {
		UserDA da= new UserDA();
		User data = da.login(id,password);
		return data;
	}


}
