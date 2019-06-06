package api.test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestSearch {

    @Test
    public void Test() {
        ResponseBody response = given()
                .baseUri("https://yandex.ru/")
                .basePath("search/")
                .param("text", "Котики")
                .get().then().extract().response();

        String countItems = ((Response) response).getHeader("x-yandex-items-count");

        System.out.println("Number of items in the list: " + countItems);
    }
}
