package com.BookStoreApp.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStoreApp.bookstoreapp.entity.MyBook;

@Repository
public interface MyBookRepository extends JpaRepository<MyBook,Integer>{

}
