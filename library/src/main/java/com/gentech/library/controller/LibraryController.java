package com.gentech.library.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.library.entity.Library;
import com.gentech.library.service.LibraryService;

@RestController
@RequestMapping("/r1/api")
public class LibraryController {
	private LibraryService libService;
	
	public LibraryController(LibraryService libService) {
		super();
		this.libService = libService;
	}

	@GetMapping("/library")
	public List<Library> getAllLibrary()
	{
		return libService.getLibrary();
	}
	
	@GetMapping("/library/{library_id}")
	public Library getSpecificLibrary(@PathVariable Long library_id) throws Exception
	{
		return libService.getSpecificBook(library_id);
	}
	
	@PostMapping("/library")
	public Library addNewBook(@RequestBody Library library)
	{
		return libService.addNewBook(library);
	}
	
	
	@PutMapping("/library/{library_id}")
	public Library updateBookName(@PathVariable Long library_id,@RequestBody Library library)
	{
		library.setLibrary_id(library_id);
		return libService.updateBookname(library);
	}
	
	
	@DeleteMapping("/library/{library_id}")
	public String deleteLibrary(@PathVariable Long library_id)
	{
		 libService.deleteBookName(library_id);
		 return "The library id "+library_id+" has removed ";
	}
}
