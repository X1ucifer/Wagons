package com.example.demo.controller;


import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.*;
import com.example.demo.service.*;
import com.example.demo.Repo.*;

@RestController
//@RequestMapping(value="/api/v1")
public class Controller {
	
	@Autowired private Service newservice;
	
    @Autowired private BookRepo bookRepository;
	

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
		
		
		@GetMapping("/ping")
	    public String ping(){
	        return "Up -books";
	    }


	    //    Request: GET /books
//	    Response: Book[]
	    @GetMapping("/books")
	    public List<Book> getAllBooks(){
	        return bookRepository.findAll();
	    }

	    //    Request: GET /book/{id}
//	    Response: Book

	    @GetMapping("/book/{id}")
	    public Book getBookById(@PathVariable long id){
	        return bookRepository.findById(id);
	    }

	    //    Request: POST /book Book
	    //    Response: Book
	    @PostMapping("/book")
	    public Book saveBook(@RequestBody Book book){
	        return bookRepository.save(book);
	    }

	    //    Request: DELETE /book/{id}
//	    Response: void
	    @DeleteMapping("/book/{id}")
	    public void deleteBookById(@PathVariable long id){
	        bookRepository.deleteById(id);
	    }

	    //    Request: PUT /book
	    //    Response: Book
	    @PutMapping("/book")
	    public Book updateBook(@RequestBody Book book){
	        bookRepository.save(book);
	        return book;
	    }

	    /*
	    @PutMapping("/book/{id}")
	    public Book updateBookById(@RequestBody Book book){
	        bookRepository.save(book);
	        return book;
	    }
	  */

	    @PutMapping("/book/{id}")
	    Book updateBookById(@RequestBody Book newBook, @PathVariable Long id) {

	        return bookRepository.findById(id).map(book -> {
	            book.setTitle(newBook.getTitle());
	            book.setAuthor(newBook.getAuthor());
	            book.setRating(newBook.getRating());
	            book.setIsbn(newBook.getIsbn());
	            return bookRepository.save(book);
	        }).orElseGet(() -> {
	            newBook.setId(id);
	            return bookRepository.save(newBook);
	        });
	    }
		

}







