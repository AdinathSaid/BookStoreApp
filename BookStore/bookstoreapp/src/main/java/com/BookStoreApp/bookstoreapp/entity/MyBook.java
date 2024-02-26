package com.BookStoreApp.bookstoreapp.entity;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Controller
@Entity
public class MyBook {
	
	@Id
	private int id;
	private String name;
	private String author;
	private String price;
	private String edition;
	public MyBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyBook(int id, String name, String author,String edition, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.edition=edition;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
