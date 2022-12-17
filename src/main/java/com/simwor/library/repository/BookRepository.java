package com.simwor.library.repository;

import com.simwor.library.bean.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

    Book findByIsbn(String isbn);

}
