/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.domain.Address;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juan.altamar
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
