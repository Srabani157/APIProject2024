package apiTesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class sendGetRequest {
    /*
     *Set authentication - Basic auth/bearer token
     *
     * Request -> Request spec(using Given)
     *
     * Response validation
     *
     */

    @Test
    public void getReq() {
        Response response = given()
                .params("limit", 3)
                .auth()
                .basic("sk_test_51L0VDRSJdvrvrGQnv0ZlEHuFLmgV45Qal0gtiMm6F1Rbd3BXcw9Vg7Sd5sz7szOmcdtZACCfG98hoLrskXhs2RXZ00t6E0fSsT"
                        , "")
                .get("https://api.stripe.com/v1/customers");
        response.prettyPrint();
        System.out.println("response code is" + response.statusCode());

    }

    @Test
    public void getReq2() {
        Response response = given()
                .header("Authorization", "bearer sk_test_51L0VDRSJdvrvrGQnv0ZlEHuFLmgV45Qal0gtiMm6F1Rbd3BXcw9Vg7Sd5sz7szOmcdtZACCfG98hoLrskXhs2RXZ00t6E0fSsT")
                .get("https://api.stripe.com/v1/customers/cus_SYA9jgbbrvA0vV");
        response.prettyPrint();

    }

    @Test
    public void postReq2() {
       /* given()
                .auth()
                .basic("sk_test_51L0VDRSJdvrvrGQnv0ZlEHuFLmgV45Qal0gtiMm6F1Rbd3BXcw9Vg7Sd5sz7szOmcdtZACCfG98hoLrskXhs2RXZ00t6E0fSsT"
                        ,"")
                .formParam("email","abc23@xyz.com")
                .formParam("name", "abc")
                .post("https://api.stripe.com/v1/customers")
                .prettyPrint();*/
        String body = "{\"email\":\"eve.holt@reqres.in\",\"password\": \"pistol\"}";
        Response response = given().contentType(ContentType.JSON).body(body)
                .post("https://reqres.in/api/register");
        response.prettyPrint();
    }
    @Test
    public void postUsingJSON() {
        /*
        * Create JSON using hashmap
        *
        * */
        HashMap<String,Object> hm = new HashMap<>();
        hm.put("email", "me2@gmail.com");
        hm.put("firstName", "First");
        hm.put("lastName", "last");

        ArrayList<Integer> listOfMobile = new ArrayList<>();
        listOfMobile.add(12345678);
        listOfMobile.add(3345678);
        
        hm.put("mobile" , listOfMobile);

        HashMap<String,Object> address = new HashMap<>();
        address.put("flatNo" ,"A-123");
        address.put("city", "Delhi");
        address.put("state", "Delhi");
        address.put("country", "India");

        hm.put("address" , address);


        Response response = given()
                .contentType(ContentType.JSON)
                .body(hm)
                .log()
                .all()
                .post("url");
    }
    @Test
    public void postUsingPojo(){

    }


}

