package com.gentech.library.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gentech.library.entity.Library;
import com.gentech.library.repository.LibraryRepository;
import com.gentech.library.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	private LibraryRepository libRepository;
	
	
	public LibraryServiceImpl(LibraryRepository libRepository) {
		super();
		this.libRepository = libRepository;
	}


	@Override
	public List<Library> getLibrary() {
		
		return libRepository.findAll();
	}


	@Override
	public Library getSpecificBook(Long library_id) throws Exception {
		Optional<Library> lib=libRepository.findById(library_id);
		if(lib.isPresent())
		{
			return lib.get();
		}
		throw new Exception("The Library ID "+library_id+"has not Available");
	}


	@Override
	public Library addNewBook(Library library) {
		return libRepository.save(library);
	}


	@Override
	public Library updateBookname(Library library) {
		return libRepository.save(library);
	}


	@Override
	public void deleteBookName(Long library_id) {
		libRepository.deleteById(library_id);
	}

}
