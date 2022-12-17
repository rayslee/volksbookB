package com.simwor.library;

import com.simwor.library.bean.Book;
import com.simwor.library.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VolksbookApplicationTests {

    @Autowired
    private BookRepository bookRepository;

	@Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setName("book");
            b.setIsbn("isbn" + i);
            bookRepository.save(b);
        }
        List<Book> books = bookRepository.findByName("book");
        books.forEach(System.out::println);
    }

}
