/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author juan.altamar
 */
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;
    
    @ManyToOne
    private Publisher publisher;

    public Address() {
    }

    
    public Address(String addressLine1, String city, String state, String zip) {
        this.addressLine1=addressLine1;
        this.city=city;
        this.state=state;
        this.zip=zip;
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
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @param addressLine1 the addressLine1 to set
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the publisher
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Publisher)) {
            return false;
        }
        Address other = (Address) obj;
        boolean addressEquals = equalsPropertyComparation(this.addressLine1, other.addressLine1);
        boolean cityEquals = equalsPropertyComparation(this.city, other.city);
        boolean idEquals = equalsPropertyComparation(this.id, other.id);
        boolean stateEquals = equalsPropertyComparation(this.state, other.state);
        boolean zipEquals = equalsPropertyComparation(this.zip, other.zip);

        return idEquals && addressEquals && cityEquals && stateEquals && zipEquals;
    }

    private boolean equalsPropertyComparation(Object actual, Object other) {
        return (actual == null && other == null) || (actual != null && actual.equals(other));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        int hash_id=id != null ? id.hashCode() : 0;
        hash = 31 * hash + (int) hash_id;
        hash = 31 * hash + (this.addressLine1 == null ? 0 : this.addressLine1.hashCode());
        hash = 31 * hash + (this.city == null ? 0 : this.city.hashCode());
        hash = 31 * hash + (this.state == null ? 0 : this.state.hashCode());
        hash = 31 * hash + (this.zip == null ? 0 : this.zip.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "Address{"
                + "id='" + id + '\''
                + ", addressLine1=" + this.addressLine1
                + ", city=" + this.city
                + ", state=" + this.state
                + ", zip=" + this.zip
                + '}';
    }

}
