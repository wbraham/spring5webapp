package me.wbraham.spring5webapp.repositories;

import me.wbraham.spring5webapp.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
