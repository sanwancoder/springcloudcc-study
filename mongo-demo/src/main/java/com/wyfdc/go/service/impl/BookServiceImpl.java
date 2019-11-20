package com.wyfdc.go.service.impl;


import com.mongodb.client.result.DeleteResult;
import com.wyfdc.go.entity.po.Book;
import com.wyfdc.go.service.BookService;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 * @Author:
 */
@Service
@Slf4j
public class BookServiceImpl implements BookService {

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public void saveBook(Book book) {
    log.info("--------------------->[MongoDB save start]");
    book.setCreatedDate(new Date());
    book.setCreatedBy("system");
    book.setUpdatedDate(new Date());
    book.setUpdatedBy("system");
    mongoTemplate.save(book);
  }

  @Override
  public Book getBookById(String id) {
    return mongoTemplate.findById(id,Book.class);
  }

  @Override
  public List<Book> findAllbook() {
    return mongoTemplate.findAll(Book.class);
  }

  @Override
  public List<Book> findByISBN(String isbn) {
    Query query = new Query(Criteria.where("isbn").is(isbn));
    return mongoTemplate.find(query, Book.class);
  }

  @Override
  public List<Book> findByISBNAndName(String isbn, String name) {
    // 写法比较low
    Criteria isbnCriteria = Criteria.where("isbn").is(isbn);
    Criteria nameCriteria = Criteria.where("name").is(name);
    Query query = new Query(new Criteria().andOperator(isbnCriteria, nameCriteria));
    return mongoTemplate.find(query, Book.class);
  }

  @Override
  public List<Book> findByNameOrAuthor(String name, String author) {
    Criteria nameCriteria = Criteria.where("name").is(name);
    Criteria priceCriteria = Criteria.where("author").is(author);
    Query query = new Query(new Criteria().orOperator(nameCriteria, priceCriteria));
    return mongoTemplate.find(query, Book.class);
  }

  @Override
  public long delBookById(String id) {
    Query query = new Query(Criteria.where("_id").is(id));
    DeleteResult deleteResult = mongoTemplate.remove(query, Book.class);
    return deleteResult.getDeletedCount();
  }

  @Override
  public long removeBookById(String id) {
    Book book = new Book();
    book.setId(id);
    DeleteResult deleteResult = mongoTemplate.remove(book);
    return deleteResult == null ? 0L : deleteResult.getDeletedCount();
  }

  @Override
  public void updatePriceById(String id, double price){
    Query query = new Query(Criteria.where("_id").is(id));
    Update update = Update.update("price",price);
    mongoTemplate.findAndModify(query, update,Book.class);
  }

}
