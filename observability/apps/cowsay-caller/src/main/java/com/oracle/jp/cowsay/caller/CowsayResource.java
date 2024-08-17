package com.oracle.jp.cowsay.caller;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/remote")
public class CowsayResource {

    private final CowsayRestClient client;

    @Inject
    public CowsayResource(@RestClient CowsayRestClient client) {
        this.client = client;
    }

    @GET
    @Path("/say")
    public Response say() {
        var result = client.say();
        return Response.ok().entity(result).build();
    }
}
