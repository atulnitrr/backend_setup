package com.atul.setup.setup.controller;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestControllerTest {

    @Before
    public void setUp() throws Exception {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 9999;
    }


    @Test
    public void test_TestController() {
        final Response response =
                given()
                        .accept("application/json")
                        .get("/test")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        final String ss = response.asString();
        System.out.println(ss);
    }

}