package com.gentech.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library")
public class Library {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="library_id")
	private Long library_id;
	
	@Column(name="library_name")
	private String library_name;
	
	@Column(name="book_title")
	private String book_title;
	
	@Column(name="author_name")
	private String author_name;
	
	@Column(name="published_year")
	private int published_year;
	
	
	public Library()
	{
		
	}
	public Library(String library_name, String book_title, String author_name, int published_year) {
		super();
		this.library_name = library_name;
		this.book_title = book_title;
		this.author_name = author_name;
		this.published_year = published_year;
	}
	public Long getLibrary_id() {
		return library_id;
	}
	public void setLibrary_id(Long library_id) {
		this.library_id = library_id;
	}
	public String getLibrary_name() {
		return library_name;
	}
	public void setLibrary_name(String library_name) {
		this.library_name = library_name;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public int getPublished_year() {
		return published_year;
	}
	public void setPublished_year(int published_year) {
		this.published_year = published_year;
	}
	
}
