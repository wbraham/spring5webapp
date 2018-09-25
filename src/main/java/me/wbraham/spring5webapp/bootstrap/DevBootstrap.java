package me.wbraham.spring5webapp.bootstrap;

import me.wbraham.spring5webapp.Model.Author;
import me.wbraham.spring5webapp.Model.Book;
import me.wbraham.spring5webapp.Model.Publisher;
import me.wbraham.spring5webapp.repositories.AuthorRepository;
import me.wbraham.spring5webapp.repositories.BookRepository;
import me.wbraham.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("Dar Nachr");
        publisherRepository.save(publisher);

        //livre 1
        Author eric = new Author("Eric","Evans");
        Book ericBook = new Book("Titre1","1234",publisher);
        eric.getBooks().add(ericBook);
        ericBook.getAuthor().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ericBook);

        //livre 2
        Author bouhmid = new Author("Bouhmid","5ringaa");
        Book bouhmidBook = new Book("Titre2","183148",publisher);

        bouhmid.getBooks().add(bouhmidBook);
        bouhmidBook.getAuthor().add(bouhmid);
        authorRepository.save(bouhmid);
        bookRepository.save(bouhmidBook);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
