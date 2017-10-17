
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morit
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Address {
    
    private String street;
    
    private String houseNumber;
    
    private String postcode;
    
    private String country;
    
    private String floor;
    
    private String city;

    public Address() {
    }

    public Address(String street, String houseNumber, String postcode, String country, String floor, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.country = country;
        this.floor = floor;
        this.city = city;
    }
    
    
    
}
