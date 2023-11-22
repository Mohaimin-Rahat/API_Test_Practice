package org.example.weather;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class DailyForecast16Days {
    public static void main(String[] args) {
        /*
        api.openweathermap.org/data/2.5/forecast/daily?lat={lat}&lon={lon}&cnt={cnt}&appid={API key}
        base=api.openweathermap.org/data/2.5
        apiKey=6d768da55a01a004876f7287c085a5db
        resource=/forecast/daily
        lat=25.2856329
        lon=51.5264162
         */

        RestAssured.baseURI="https://api.openweathermap.org/data/2.5";

        String resource="/forecast";

        String lat="25.2856329";

        String lon="51.5264162";

        String api="6d768da55a01a004876f7287c085a5db";

        String cnt="16";
        Response response=given()
                .queryParam("lon",lon)
                .queryParam("lat",lat)
                .queryParam("cnt",cnt)
                .queryParam("appid",api)
                .get(resource);

        System.out.println(response.prettyPrint());



    }

}
