package com.oracle.jp.cowsay.caller;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/cowsay")
@RegisterRestClient(configKey = "cowsay")
public interface CowsayRestClient {

    @GET
    @Path("/say")
    public String say();
}
