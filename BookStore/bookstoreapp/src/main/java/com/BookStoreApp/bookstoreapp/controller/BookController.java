package com.BookStoreApp.bookstoreapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.BookStoreApp.bookstoreapp.entity.BookEntity;
import com.BookStoreApp.bookstoreapp.entity.MyBook;
import com.BookStoreApp.bookstoreapp.service.BookService;
import com.BookStoreApp.bookstoreapp.service.MyBookService;

import ch.qos.logback.core.model.Model;

@Controller
public class BookController {
		@Autowired
		BookService bookService;
		@Autowired
		MyBookService mybookService;
		
		
	    @GetMapping("/")
		public String display() {
			return "home";
		}
	    @GetMapping("/book_register")
		public String registerbook() {
			return "bookregister";
		}
//	    @GetMapping("/mybooks")
//		public String getmybook() {
//			return "mybooks";
//		}
	    
	    @GetMapping("/available_books")
	    public ModelAndView availableBooks() {
	    	List<BookEntity> list= bookService.getAllBooks();
	    	ModelAndView mv=new ModelAndView();
	    	mv.setViewName("booklist");
	    	mv.addObject("book",list);
	    	
	    	//we can also return like: return new ModelAndView("booklist","book",list);
	    	return mv;
	    }
	    @RequestMapping("/mylist/{id}")
	    public String getmybooklist(@PathVariable("id") int id) {
	    	BookEntity b=bookService.getbook(id);
	    	MyBook mb=new MyBook(b.getId(),b.getName(),b.getAuthor(),b.getEdition(),b.getPrice());
	    	mybookService.addbook(mb);
	    	return "redirect:/mybooks";
	    }
	    
	    @GetMapping("/mybooks")
		public String getMyBooks(org.springframework.ui.Model model)
		{
			List<MyBook>list=mybookService.getmybooks();
			model.addAttribute("book",list);
			return "mybooks";
		}
	    
	    @PostMapping("/save")
	    public String addBook(@ModelAttribute BookEntity b) {
	    	bookService.savebook(b);
	    	return "booklist";
	    }
	    
	    @GetMapping("/editBook/{id}")
	    public String editbook(@PathVariable("id") int id,org.springframework.ui.Model model) {//model is used to send the data from controller to view
	    	BookEntity b=bookService.getbook(id);
	    	model.addAttribute("book", b);
	    	return "bookedit";
	    }
	    @RequestMapping("/deleteBook/{id}")
		public String deletemylist(@PathVariable("id") int id) {
			 bookService.deletebyid(id);
			 return "redirect:/available_books";
		}
}
