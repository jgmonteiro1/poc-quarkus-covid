package com.jgmonteiro.resources;

import com.jgmonteiro.entities.Cases;
import com.jgmonteiro.services.CovidApiService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/cases")
public class CasesResource {

    @Inject
            @RestClient
    CovidApiService covidApiService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Cases getCases(@QueryParam("country") String country){
        Cases casesResponse = covidApiService.getCases(country);
        return casesResponse;
    }
}
