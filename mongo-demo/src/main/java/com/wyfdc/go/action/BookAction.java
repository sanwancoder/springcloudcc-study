package com.wyfdc.go.action;

import com.wyfdc.go.common.response.ResponseData;
import com.wyfdc.go.entity.po.Book;
import com.wyfdc.go.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:
 */
@RestController
@RequestMapping(path = "/book")
public class BookAction {

  @Autowired
  private BookService bookService;

  @GetMapping(path = "/isbn/{isbn}")
  public ResponseData<List<Book>> getBookByISBN(
      @PathVariable(value = "isbn", required = true) String isbn) {
    return new ResponseData<>(bookService.findByISBN(isbn));
  }

  @GetMapping(path = "/id/{id}")
  public ResponseData<Book> getBookByID(@PathVariable(value = "id", required = true) String id) {
    return new ResponseData<>(bookService.getBookById(id));
  }

  @DeleteMapping(path = "/id/{id}")
  public ResponseData<Long> delBookByID(@PathVariable(value = "id", required = true) String id) {
    return new ResponseData<Long>(bookService.delBookById(id));
  }

  @DeleteMapping(path = "/remove/id/{id}")
  public ResponseData<Long> removeBookByID(@PathVariable(value = "id", required = true) String id) {
    return new ResponseData<Long>(bookService.removeBookById(id));
  }

  @GetMapping(path = "/isbn/{isbn}/name/{name}")
  public ResponseData<List<Book>> findByISBNAndName(
      @PathVariable(value = "isbn", required = true) String isbn,
      @PathVariable(value = "name", required = true) String name) {
    return new ResponseData<List<Book>>(bookService.findByISBNAndName(isbn, name));
  }

  @GetMapping(path = "/id/{id}/price/{price}")
  public ResponseData<Void> updatePriceById(
      @PathVariable(value = "id", required = true) String id,
      @PathVariable(value = "price", required = true) double price) {
    bookService.updatePriceById(id, price);
    return new ResponseData<>(null);
  }

  @GetMapping(path = "/author/{author}/name/{name}")
  public ResponseData<List<Book>> findByNameOrAuthor(
      @PathVariable(value = "author", required = true) String author,
      @PathVariable(value = "name", required = true) String name) {
    return new ResponseData<List<Book>>(bookService.findByNameOrAuthor(name, author));
  }

  @PostMapping
  public ResponseData<Boolean> saveBookByISBN(@RequestBody Book book) {
    bookService.saveBook(book);
    return new ResponseData<Boolean>(true);
  }

  @GetMapping(path = "/all")
  public ResponseData<List<Book>> getAllBook() {
    List<Book> books = bookService.findAllbook();
    return new ResponseData<>(books);
  }

}
