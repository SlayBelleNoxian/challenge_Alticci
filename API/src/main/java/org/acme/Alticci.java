package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.math.*;


@Path("/alticci")
public class Alticci {
    Functions function = new Functions();
    @GET
    @Path("/{id}")
    public String alticci(String id) {
        //Transform the String into a integer
        long value = Long.parseLong(id);
        //The numbers can't be negative so the loop doesn't go infinite
        if (value < 0) return "Numero tem de ser maior ou igual a 0";
        //returning the function "Alticci"
        return String.valueOf(Functions.a(value));
    }
}