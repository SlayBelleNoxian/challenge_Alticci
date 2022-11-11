package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class Alticci {
    @GET
    @Path("/{id}")
    public String alticci(String id) {
        //Transform the String into a integer
        int value = Integer.parseInt(id);
        //The numbers can't be negative so the loop doesn't go infinite
        if (value < 0) return "Numero tem de ser maio ou igual a 0";
        //returning the function "Alticci"
        return "Abacate " + id;
    }
}