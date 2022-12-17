package com.simwor.library.service.impl;

import com.simwor.library.bean.Book;
import com.simwor.library.repository.AuthorRepository;
import com.simwor.library.repository.BookRepository;
import com.simwor.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book queryByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public List<Book> queryByName(String name) {
        return bookRepository.findByName(name);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

}
