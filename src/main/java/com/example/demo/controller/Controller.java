package com.example.demo.controller;


//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.*;
import com.example.demo.service.*;

@RestController
@RequestMapping(value="/api/v1")
public class Controller {
	
	@Autowired private Service newservice;
	

//	
//		@GetMapping(value="/aj")
//		public List<UserSignup> getData(){
//			
//			return newservice.get();
//		}
		
		@PostMapping(value="/signup")
		public String signup(@RequestBody UserSignup user ){
			return newservice.data(user);
		}
		
		@PostMapping(value="/login")
		public String login(@RequestBody UserSignup login ){
			return newservice.login(login);
		}
		
//		
		@PostMapping(value="/drivers")
		public String drivers(@RequestBody UserSignup dlogin ){
			return newservice.Driverlogin(dlogin);
		}
		
		

}







