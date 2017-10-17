package webservice.resource;


import model.gasstation.GasStation;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morit
 */

@Path("gasstation")
public class GasStationResource {
    
    @GET
    @Path("sample")
    public GasStation sample() {
        return GasStation._sample();
    }
}
