package Demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tests {

    @Test
    public void test(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response status code "+response.getStatusCode());
        String bodyAsString = response.getBody().asString();
        Assert.assertEquals(bodyAsString.contains("Michael") , true , "Michael");
    }

    @Test
    public void JSONParser() throws IOException {
//        Things you can practice:
//        Extracting nested values (user.profile.address.city)
//        Accessing arrays (user.roles[0], orders[1].items[0].name)
//        Filtering in JSONPath (orders.findAll { it.amount > 100 })
//        Boolean and numeric fields (user.profile.preferences.newsletter, orders[0].amount)
        String jsonResponse = Files.readString(Path.of(System.getProperty("user.dir") + "/src/test/resources/JSONs/JSONTest.json"));
        JsonPath jsonPath = new JsonPath(jsonResponse);

//        System.out.println(jsonPath.getInt("user.id"));
//        System.out.println(jsonPath.getString("user.name"));
//        System.out.println(jsonPath.getString("user.email"));
//        System.out.println(jsonPath.getString("user.roles[0]"));
//        System.out.println(jsonPath.getInt("user.profile.age"));
//        System.out.println(jsonPath.getString("user.profile.address.street"));
//        System.out.println(jsonPath.getString("user.profile.preferences.newsletter"));
//        System.out.println(jsonPath.getString("user.profile.preferences.notifications.sms"));

        System.out.println(jsonPath.getString("orders[0].orderId"));
        System.out.println(jsonPath.getString("orders[0].amount"));
        System.out.println(jsonPath.getString("orders.items.productId.flatten()[2]"));
    }
}
