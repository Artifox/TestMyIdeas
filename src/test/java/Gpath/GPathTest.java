package Gpath;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

public class GPathTest {

    String theJson = "{\n" +
            "    \"page\": 2,\n" +
            "    \"per_page\": 6,\n" +
            "    \"total\": 12,\n" +
            "    \"total_pages\": 2,\n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"id\": 7,\n" +
            "            \"email\": \"michael.lawson@reqres.in\",\n" +
            "            \"first_name\": \"Michael\",\n" +
            "            \"last_name\": \"Lawson\",\n" +
            "            \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8,\n" +
            "            \"email\": \"lindsay.ferguson@reqres.in\",\n" +
            "            \"first_name\": \"Lindsay\",\n" +
            "            \"last_name\": \"Ferguson\",\n" +
            "            \"avatar\": \"https://reqres.in/img/faces/8-image.jpg\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 9,\n" +
            "            \"email\": \"tobias.funke@reqres.in\",\n" +
            "            \"first_name\": \"Tobias\",\n" +
            "            \"last_name\": \"Funke\",\n" +
            "            \"avatar\": \"https://reqres.in/img/faces/9-image.jpg\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 10,\n" +
            "            \"email\": \"byron.fields@reqres.in\",\n" +
            "            \"first_name\": \"Byron\",\n" +
            "            \"last_name\": \"Fields\",\n" +
            "            \"avatar\": \"https://reqres.in/img/faces/10-image.jpg\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 11,\n" +
            "            \"email\": \"george.edwards@reqres.in\",\n" +
            "            \"first_name\": \"George\",\n" +
            "            \"last_name\": \"Edwards\",\n" +
            "            \"avatar\": \"https://reqres.in/img/faces/11-image.jpg\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"email\": \"rachel.howell@reqres.in\",\n" +
            "            \"first_name\": \"Rachel\",\n" +
            "            \"last_name\": \"Howell\",\n" +
            "            \"avatar\": \"https://reqres.in/img/faces/12-image.jpg\"\n" +
            "        }\n" +
            "    ],\n" +
            "\n" +
            "    }";


    @Test
    public void dummyEndpoint() {

        JsonPath jsonPath = new JsonPath(theJson);

        Object allDetailsForSinglePP = jsonPath.get("data.find {it.id == 7}.first_name");

        System.out.println(allDetailsForSinglePP);

    }
}
