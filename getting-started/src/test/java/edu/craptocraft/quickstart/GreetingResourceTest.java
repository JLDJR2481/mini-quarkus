package edu.craptocraft.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("20"));
        // Con Mock, 20. Normal, 100
        // given()
        // .when().get("/hello")
        // .then()
        // .statusCode(200)
        // .body(is("100"));
    }

}