/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author juan.altamar
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "publisher")
    private Set<Address> addresses= new HashSet<>();
    
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher() {
    }

    
    public Publisher(String name) {
        this.name=name;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the addresses
     */
    public Set<Address> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
    
    /**
     * @return the books
     */
    public Set<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Publisher)) {
            return false;
        }
        Publisher other = (Publisher) obj;
        return equalsPropertyComparation(this.id, other.id)
                && equalsPropertyComparation(this.name, other.name)
                && equalsPropertyComparation(this.addresses, other.addresses);
    }

    private boolean equalsPropertyComparation(Object actual, Object other) {
        return (actual == null && other == null) || (actual != null && actual.equals(other));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (id != null ? id.hashCode() : 0);
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (this.addresses == null ? 0 : this.addresses.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "Publisher{"
                + "id='" + id + '\''
                + ", name=" + name
                + ", addresses=" + addresses
                + '}';
    }

}
