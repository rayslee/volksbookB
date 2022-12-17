package com.simwor.library.service;

import com.simwor.library.bean.Book;

import java.util.List;

public interface BookService {
    Book queryByIsbn(String isbn);

    List<Book> queryByName(String name);

    void save(Book book);
}
