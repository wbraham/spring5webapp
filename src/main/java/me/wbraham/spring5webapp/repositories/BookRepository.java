package me.wbraham.spring5webapp.repositories;

import me.wbraham.spring5webapp.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
