package com.gentech.library.service;

import java.util.List;

import com.gentech.library.entity.Library;

public interface LibraryService {
	
	List<Library> getLibrary();
	
	Library getSpecificBook(Long library_id) throws Exception;
	
	Library addNewBook(Library library);
	
	Library updateBookname(Library library);
	
	void deleteBookName(Long library_id);
	
}
