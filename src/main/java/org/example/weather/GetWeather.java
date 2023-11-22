package org.example.weather;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetWeather {

    public static void main(String[] args) {

        /*
        domain=https://api.openweathermap.org/data/2.5
        resource=/weather
        queryParam=> lat=51.4875167
        queryParam => lon=0.1687007
        api key = 6d768da55a01a004876f7287c085a5db
 https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

         */
        RestAssured.baseURI="https://api.openweathermap.org/data/2.5";

        String apiKey="6d768da55a01a004876f7287c085a5db";

        String resource= "/weather";

        String longitude="51.4875167";

        String latitude="0.1687007";

        String unittype="metric";

        Response response=given()
                .queryParam("lon",longitude)
                .queryParam("lat",latitude)
                .queryParam("appid",apiKey)
                .queryParam("units",unittype)
                .get(resource);

        System.out.println(response.prettyPrint());

    }
}
