package org.example.weather;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class FourDaysReport {

    public static void main(String[] args) {

        /*
        url=https://pro.openweathermap.org/data/2.5/
        resource=forecast/hourly
        lat=23.7644025
        lon=90.389015
        api=6d768da55a01a004876f7287c085a5db
         */

        RestAssured.baseURI="https://pro.openweathermap.org/data/2.5";

        String resource="/forecast";

        String latitude="23.7644025";

        String longitude = "90.389015";

        String apiKey="6d768da55a01a004876f7287c085a5db";


        Response response= given()
                .queryParam("lon",longitude)
                .queryParam("lat",latitude)
                .queryParam("appid",apiKey)
                .get(resource);

        System.out.println(response.prettyPrint());


    }
}
