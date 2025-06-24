package pojo;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ComplexJson {
    public static void main(String[] args) {
        UserPojos userPojos = new UserPojos(12345,"srabani", "s123@gmail.com","IT");
        userPojos.setSkills("Java", "Selenium", "RestAssured", "Git");
        given().contentType(ContentType.JSON).body(userPojos).log().all()
                .post("https://webhook.site/#!/view/51bede86-a1e9-4027-a370-8ffc0a37b304");

    }
}
