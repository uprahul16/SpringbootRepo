package com.springboot.firstspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.firstspring.controller.Library;
//import com.springboot.firstspring.controller.Library;
import com.springboot.firstspring.repository.LibraryRepository;

@SpringBootApplication
public class LearningApplication { //implements CommandLineRunner
	
	@Autowired
	LibraryRepository repo;
	//@Autowired
//	Library lib, en;

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}
	

	
	/*@Override
	public void run(String args[]) {
		
		//reading value from db
		
		Library lib = repo.findById("1234").get();
		System.out.println(lib.getBook_name());
		System.out.println(lib.getAisle());
		
		
		//writing value to db using library repo
		Library en = new Library();
		en.setAisle(8989);
		en.setAuthor("Nikku");
		en.setBook_name("Peachu");
		en.setId("4545");
		en.setIsbn("ghghg");
		//repo.save(en);
		
		//reading values for all the records from db
		List<Library> allrecords = repo.findAll();
		for (Library Item : allrecords) {
			System.out.println(Item.getBook_name());
		}
		
		//deleting a record from db with help of entity
		repo.delete(en);
	}*/

}


