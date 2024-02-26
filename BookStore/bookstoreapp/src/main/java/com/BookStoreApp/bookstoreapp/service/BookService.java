package com.BookStoreApp.bookstoreapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStoreApp.bookstoreapp.entity.BookEntity;
import com.BookStoreApp.bookstoreapp.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository brepo;
	
	public void savebook(BookEntity b) {
		brepo.save(b);
	}
	
	public List<BookEntity> getAllBooks(){
		return brepo.findAll();
	}
	public BookEntity getbook(int id) {
		return brepo.findById(id).get();
	}
	public void deletebyid(int id) {
		brepo.deleteById(id);
	}
}
