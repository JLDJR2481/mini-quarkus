// package edu.craptocraft.quickstart;

// import jakarta.ws.rs.BeanParam;
// import jakarta.ws.rs.GET;
// import jakarta.ws.rs.Path;
// import jakarta.ws.rs.Produces;
// import jakarta.ws.rs.core.MediaType;

// import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
// import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

// @Path("/api")
// @RegisterRestClient
// public interface WorldClockService {

// @GET
// @Path("/json/cet/now")
// @Produces(MediaType.APPLICATION_JSON)
// @ClientHeaderParam(name = "X-Logger", value = "DEBUG")
// WorldClock getNow(@BeanParam WorldClockHeaders worldClockHeaders);
// }