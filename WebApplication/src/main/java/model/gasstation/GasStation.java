package model.gasstation;


import model.core.Address;
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
public class GasStation {
    
    private float latitude;
    
    private float longitude;
    
    private String name;
    
    private Address address;

    public GasStation() {
        
    }

    public GasStation(float latitude, float longitude, String name, Address address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
    }
    
    public static GasStation _sample() {
        Address address = new Address("Sample-Street", "1", "09463", "Germany", "", "Hof");
        return new GasStation(50.3135391f, 11.912781399999972f, "Sample-Station", address);
    }
}
