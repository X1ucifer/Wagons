package com.example.demo.Repo;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.*;

public interface Repo extends JpaRepository<UserSignup, Integer> {
	UserSignup findByEmail(String email);
}
