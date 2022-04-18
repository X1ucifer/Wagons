package com.example.demo.service;

//import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repo.*;
import com.example.demo.models.UserSignup;


@org.springframework.stereotype.Service
public class Service {
	
	@Autowired private Repo newrepo;
	
	public String data(UserSignup user) {
		
		if (user.getPassword().length() < 6) {
			return "Password should be min 6 character";
		}
		
		if (user.getEmail() == "") {
			return "Please Enter Email";
		}
		
		if (user.getUserName() == "") {
			return "Please Enter UserName";
		}
		
		user.setRole("User");
		newrepo.save(user);
		return "Success";
		
	}
	
	public String login(UserSignup login) {
		UserSignup data = newrepo.findByEmail(login.getEmail());
		
		if (data != null) {
			if(data.getPassword().equals (login.getPassword())) {
				return "Authenticated";
			}
			
			return "Password is wrong";
		}
		 return "User Not Found";
	}
	
	public String Driverlogin(UserSignup dlogin) {
		if (dlogin.getPassword().length() < 6) {
			return "Password should be min 6 character";
		}
		
		if (dlogin.getEmail() == "") {
			return "Please Enter Email";
		}
		
		if (dlogin.getUserName() == "") {
			return "Please Enter UserName";
		}
		
		dlogin.setRole("Taxi Owners");
		newrepo.save(dlogin);
		return "Successfully Registered";
	}

}
