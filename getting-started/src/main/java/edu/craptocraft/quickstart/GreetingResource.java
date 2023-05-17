package edu.craptocraft.quickstart;

import org.eclipse.microprofile.config.inject.ConfigProperty;

// import jakarta.inject.Inject;

// import org.eclipse.microprofile.rest.client.inject.RestClient;

// import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
// import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    // @Inject
    // @RestClient
    // WorldClockService worldClockService;

    // @Inject
    // ExpensiveService expensiveService;

    @ConfigProperty(name = "greeting.message")
    String msg;

    // @GET
    // @Produces(MediaType.APPLICATION_JSON)
    // public WorldClock getNow() {
    // return ClientBuilder.newClient().target("http://worldclockapi.com")
    // .path("/api/json/cet/now").request().get(WorldClock.class);

    // }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeer(@Valid Beer beer) {
        System.out.println(beer);
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return msg;

    }
}
