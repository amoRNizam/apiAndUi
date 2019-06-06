package api.test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.head;

public class TestKSEDLogin {
    @Test
    public void testSimpleTest() {
        HashMap<String, String> user = new HashMap<>();
        user.put("username", "initiatorks");
        user.put("password", "Qwer1234");

        RequestSpecification requestSpecification = new RequestSpecBuilder()
//                .setBaseUri("http://213.128.208.34/share/page")
                .setBaseUri("http://172.30.48.50:8080/share/page")
                .log(LogDetail.URI)
                .build();

        ExtractableResponse<Response> extract = given(requestSpecification)
                .params(user)
                .basePath("/dologin")
                .post()
                .then().statusCode(302)
                .extract();
        System.out.println(extract.header("Location")+"\n");

        String sessionId = extract.response().getCookie("JSESSIONID");

        // следующий запрос в котором передаем куку с id сессии
        given(requestSpecification)
//                .basePath("/arm")
                //.param("code", "")
                .sessionId(sessionId)
                .get()
                .then()
                .statusCode(200)
                .extract().response().prettyPrint();
    }
}
