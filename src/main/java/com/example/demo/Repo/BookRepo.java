package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Book;


public interface BookRepo extends JpaRepository<Book, Long>{
	
	  	List<Book> findAll();
	    Book findById(long id);

}
