package me.wbraham.spring5webapp.repositories;

import me.wbraham.spring5webapp.Model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
