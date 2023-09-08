package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Address;
import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repository.AddressRepository;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author juan.altamar
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final AddressRepository addressRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, AddressRepository addressRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        Publisher penguinRandomHouse = new Publisher("Penguin Random House");
        Address addrsPenguinRandomHouse = new Address("Carrera 5A, No. 34A-09", "Bogotá", "Bogotá", "111071");
        addrsPenguinRandomHouse.setPublisher(penguinRandomHouse);
        penguinRandomHouse.getAddresses().add(addrsPenguinRandomHouse);
        ddd.setPublisher(penguinRandomHouse);        
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        noEJB.setPublisher(penguinRandomHouse);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        
        authorRepository.save(eric);
        authorRepository.save(rod);
        
        publisherRepository.save(penguinRandomHouse);
        addressRepository.save(addrsPenguinRandomHouse);
        
        bookRepository.save(ddd);
        bookRepository.save(noEJB);
        
        
        
        
        
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }

}
