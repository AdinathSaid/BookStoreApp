package com.BookStoreApp.bookstoreapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStoreApp.bookstoreapp.entity.MyBook;
import com.BookStoreApp.bookstoreapp.repository.MyBookRepository;

@Service
public class MyBookService {
	@Autowired
	MyBookRepository bookRepository;
	
	public void addbook(MyBook book){
		bookRepository.save(book);
	}
	
	public List<MyBook> getmybooks(){
		return bookRepository.findAll();
	}
	
	public void deletebyid(int id) {
		bookRepository.deleteById(id);
	}
}
