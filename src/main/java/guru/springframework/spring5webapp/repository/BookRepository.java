/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juan.altamar
 * CrudRepository
 *  Book - Refer to the domain class
 *  Long - Refer of the class type for the id of Book
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    
}
