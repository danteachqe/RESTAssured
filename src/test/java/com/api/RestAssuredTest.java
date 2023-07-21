package com.api;

import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

    @Test
    public void testAddOperation() {
        // Set the base URI of the REST API
        RestAssured.baseURI = "http://playground1.azurewebsites.net";

        // Create a JSON payload
        String jsonPayload = "{"
                + "\"operation\": \"add\","
                + "\"number1\": 10,"
                + "\"number2\": 5"
                + "}";

        // Start a request
        RestAssured restAssured = new RestAssured();
        Response response = restAssured.given()
                .contentType("application/json")
                .body(jsonPayload)
                .post("/calculate");

        // Validate the response
        response.then()
                .statusCode(200)
                .body("result", equalTo(15.0F));
    }

    @Test
    public void testSubtractOperation() {
        // Set the base URI of the REST API
        RestAssured.baseURI = "http://playground1.azurewebsites.net";

        // Create a JSON payload
        String jsonPayload = "{"
                + "\"operation\": \"subtract\","
                + "\"number1\": 10,"
                + "\"number2\": 5"
                + "}";

        // Start a request
        RestAssured restAssured = new RestAssured();
        Response response = restAssured.given()
                .contentType("application/json")
                .body(jsonPayload)
                .post("/calculate");

        // Validate the response
        response.then()
                .statusCode(200)
                .body("result", equalTo(5.0F));
    }

    @Test
    public void testDivisiontOperation() {
        // Set the base URI of the REST API
        RestAssured.baseURI = "http://playground1.azurewebsites.net";

        // Create a JSON payload
        String jsonPayload = "{"
                + "\"operation\": \"divide\","
                + "\"number1\": 10,"
                + "\"number2\": 5"
                + "}";

        // Start a request
        RestAssured restAssured = new RestAssured();
        Response response = restAssured.given()
                .contentType("application/json")
                .body(jsonPayload)
                .post("/calculate");

        // Validate the response
        response.then()
                .statusCode(200)
                .body("result", equalTo(2.0F));
    }
}
