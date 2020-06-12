package ru.maxology;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FruitResourceTest {

    @Test
    public void testGetFruitsEndpoint() {
        given()
          .when().get("/fruits")
          .then()
             .statusCode(200);
    }

}