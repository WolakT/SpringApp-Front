package com.sda.controller;

import java.util.List;
import java.util.Map;

import com.sda.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sda.model.Book;
import com.sda.model.Customer;
import com.sda.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BooksController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book/add",method = RequestMethod.GET)
    public String addBookForm() {
        return "addBook";
    }

    @RequestMapping(value = "/book/add",method = RequestMethod.POST)
    public String addBook(@ModelAttribute Book book) {
        String response = bookService.addBook(book);
        System.out.println(book);
        return "bookSuccess";
    }

    @RequestMapping("/books")
    public String books(Map<String, Object> model) {
        List<Book> books = bookService.getAll();
        model.put("books", books);
        return "books";
    }
}
