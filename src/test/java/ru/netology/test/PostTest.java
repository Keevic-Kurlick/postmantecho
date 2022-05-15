package ru.netology.test;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostTest {
    @Test
    void shouldPost() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("johnatan")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("data", equalTo("johnatn"));
    }
}
