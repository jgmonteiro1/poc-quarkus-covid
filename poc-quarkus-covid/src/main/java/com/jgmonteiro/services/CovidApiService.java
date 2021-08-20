package com.jgmonteiro.services;

import com.jgmonteiro.entities.Cases;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@RegisterRestClient(configKey = "Covid19Api")
@Produces(MediaType.APPLICATION_JSON)
public interface CovidApiService {

    @GET
    @Path("/v1/cases")
    Cases getCases(@QueryParam("country") String country);
}
