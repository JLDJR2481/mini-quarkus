package edu.craptocraft.quickstart;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @Inject
    @RestClient
    WorldClockService worldClockService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeer(@Valid Beer beer) {
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ClientHeaderParam(name = "X-Logger", value = "DEBUG")
    public WorldClock worldClock() {
        WorldClockHeaders worldClockHeaders = new WorldClockHeaders();
        worldClockHeaders.logger = "DEBUG";
        return worldClockService.getNow(worldClockHeaders);
    }
}
