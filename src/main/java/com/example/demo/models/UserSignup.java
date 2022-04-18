package com.example.demo.models;

import javax.persistence.*;


@Entity
@Table (name = "userTable") 
public class UserSignup {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "username", length=255)
		private String UserName;

		@Column(name = "email", length=255)
		public String email;
		
		@Column(name = "role")
		private String role;
		
		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUserName() {
			return UserName;
		}

		public void setUserName(String username) {
			UserName = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		@Column (name = "password")
		private String Password;

	     
	}


