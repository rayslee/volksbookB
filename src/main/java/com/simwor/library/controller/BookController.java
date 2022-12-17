package com.simwor.library.controller;

import com.simwor.library.bean.Book;
import com.simwor.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/query-by-isbn")
    public Book queryByIsbn(@RequestParam String isbn) {
        return bookService.queryByIsbn(isbn);
    }

    @GetMapping("/query-by-name")
    public List<Book> queryByName(@RequestParam String name) {
        return bookService.queryByName(name);
    }

    @PostMapping("/save")
    public void save(@RequestBody Book book) {
        bookService.save(book);
    }

}
