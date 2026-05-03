package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ExtractJSONResponse {
    public static void main(String[] args) {
        RestAssured.baseURI="https://api.stripe.com";
        Response response = given().auth()
                .basic("sk_test_51L0VDRSJdvrvrGQnv0ZlEHuFLmgV45Qal0gtiMm6F1Rbd3BXcw9Vg7Sd5sz7szOmcdtZACCfG98hoLrskXhs2RXZ00t6E0fSsT"
                , "")
                .param("name", "SM")
                .param("email", "a123@gmail.com")
                .formParam("preferred_locales[0]" ,"yes")
                .formParam("preferred_locales[1]","no")
                .post("v1/customers");
        response.prettyPrint();
        System.out.println(response.jsonPath().getString("preferred_locales[0]"));
    }
}
