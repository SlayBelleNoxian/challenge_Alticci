package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class Alticci {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/{n}")
    public Objectcreation alticci(String n) {
        //Transform the String into a integer
        long value = Long.parseLong(n);
        //The numbers can't be negative so the loop doesn't go infinite
        if (value < 0) return new Objectcreation("Numero tem de ser maior ou igual a 0");
        //returning the function "Alticci"
        return new Objectcreation(String.valueOf(Functions.a(value)));
    }
}