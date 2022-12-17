package com.simwor.library.repository;

import com.simwor.library.bean.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    Author findByName(String name);

}
