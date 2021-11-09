package com.springboot.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.firstspring.controller.Library;

public interface LibraryRepository extends JpaRepository<Library, String> {

}
