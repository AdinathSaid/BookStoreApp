package com.BookStoreApp.bookstoreapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BookStoreApp.bookstoreapp.service.MyBookService;

@Controller
public class MyBookListController {
	@Autowired
	MyBookService bookService;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deletemylist(@PathVariable("id") int id) {
		 bookService.deletebyid(id);
		 return "redirect:/mybooks";
	}
}
