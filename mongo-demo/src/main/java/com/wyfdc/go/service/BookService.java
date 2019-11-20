package com.wyfdc.go.service;

import com.wyfdc.go.entity.po.Book;
import java.util.List;

/**
 * @Author:  
 */
public interface BookService {

  void saveBook(Book book);

  Book getBookById(String id);

  List<Book> findAllbook();

  List<Book> findByISBN(String isbn);

  List<Book> findByISBNAndName(String isbn, String name);

  List<Book> findByNameOrAuthor(String name, String author);

  long delBookById(String id);

  long removeBookById(String id);

  void updatePriceById(String id, double price);
}
