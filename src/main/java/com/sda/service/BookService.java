package com.sda.service;

import com.sda.model.Book;
import com.sda.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by RENT on 2017-08-18.
 */
@Service
public class BookService {

    private RestTemplate restTemplate;

    public BookService() {
        this.restTemplate = new RestTemplate();
    }

    public String addBook(Book book) {
        ResponseEntity<String> forEntity = restTemplate.postForEntity("http://localhost:8020/book", book, String.class);
        return forEntity.getBody();

    }
    public List<Book> getAll() {
        ResponseEntity<List> forEntity = restTemplate.getForEntity("http://localhost:8020/book/all", List.class);
        return forEntity.getBody();
    }
}
