package com.springboot.firstspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
		
		String id = library.getIsbn()+library.getAisle();
		library.setId(id);
		repository.save(library);
		ad.setMsg("Success book is added !! ");
		ad.setId(id);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("unique id", id);
		return new ResponseEntity<AddResponse>(ad,headers,HttpStatus.CREATED);
		
	}

}
