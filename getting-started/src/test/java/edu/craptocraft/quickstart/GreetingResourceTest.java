package edu.craptocraft.quickstart;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@QuarkusTestResource(HelloWorldQuarkusTestResourceLifeCycleManager.class)
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        // Mock
        // given()
        // .when().get("/hello")
        // .then()
        // .statusCode(200)
        // .body(is("20"));

        // Normal
        // given()
        // .when().get("/hello")
        // .then()
        // .statusCode(200)
        // .body(is("100"));

        // Vuelta a string
        // given().when().get("/hello").then().statusCode(200).body(is("Hello World"));

        // Con LifeCycleManager
        given().when().get("/hello").then().statusCode(200).body(is("Aloha Test"));
    }

}