package com.BookStoreApp.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStoreApp.bookstoreapp.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer> {

}
