package com.springboot.firstspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.firstspring.repository.LibraryRepository;


@RestController
public class LibraryController {
	
	@Autowired
	LibraryRepository repository;
	@Autowired
	AddResponse ad;
	
	@PostMapping("/addBook")
	public ResponseEntity addBookImplementation(@RequestBody Library library) {
		
		library.setId(library.getIsbn()+library.getAisle());
		repository.save(library);
		ad.setMsg("Success book is added !! ");
		ad.setId(library.getIsbn()+library.getAisle());
		
		return new ResponseEntity<AddResponse>(ad,HttpStatus.CREATED);
		
	}

}
