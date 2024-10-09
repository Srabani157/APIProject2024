package Demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tests {

    @Test
    public void test(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response status code "+response.getStatusCode());
        String bodyAsString = response.getBody().asString();
        Assert.assertEquals(bodyAsString.contains("Michael") , true , "Michael");

    }
}
