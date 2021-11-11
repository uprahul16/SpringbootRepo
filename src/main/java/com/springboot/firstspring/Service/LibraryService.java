package com.springboot.firstspring.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.firstspring.controller.Library;
import com.springboot.firstspring.repository.LibraryRepository;

@Service
public class LibraryService {
	
	@Autowired
	LibraryRepository repo;
	
	public String generateId(String isbn, int aisle) {
		return isbn+aisle;
	}
	
	public boolean checkBookAlreadyExists(String id) {
		
		Optional <Library> lib = repo.findById(id);
		if(lib.isPresent()) return true;
		else
			return false;
		
	}

}
