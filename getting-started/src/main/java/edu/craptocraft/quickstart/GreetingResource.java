package edu.craptocraft.quickstart;

import org.jboss.logging.Logger;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    Logger logger = Logger.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)

    public Beer getBeer() {
        logger.debug("Hello from Log");
        return new Beer("Alhambra", 300);

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeer(Beer beer) {
        System.out.println(beer);
        return Response.ok().build();
    }
}
