package pojo;

import io.restassured.http.ContentType;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;

public class CreateComplexJsonUsingPOJO {
    public static void main(String[] args) {
        UserPojos userPojos = new UserPojos(12345,"srabani", "s123@gmail.com","IT",true);

        userPojos.setSkills("Java", "Selenium", "RestAssured", "Git");

        Address address = new Address("456 Elm Street", "Metropolis", 54321);
        userPojos.setAddress(address);

        Projects project1 = new Projects("P100", "Chatbot Development", "Ongoing");
        Projects project2 = new Projects("P101", "API Automation", "Completed");
        ArrayList<Projects> al = new ArrayList<>();
        al.add(project1);
        al.add(project2);
        userPojos.setProjects(al);

        given().contentType(ContentType.JSON).body(userPojos).log().all()
                .post("https://webhook.site/51bede86-a1e9-4027-a370-8ffc0a37b304");

    }
}
