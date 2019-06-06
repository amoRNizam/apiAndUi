package api.controllers;

//import alfresco.s.api.login.models.LoginTicket;
import alfresco.s.api.login.user.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//import io.restassured.RestAssured;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.LogDetail;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//
//import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.preemptive;

public class LoginController {

//    private RequestSpecification requestSpecification;

    public LoginController() {
//        requestSpecification = new RequestSpecBuilder()
//                .setBaseUri("http://172.30.48.50:8080/alfresco/s/api")
//                .setBasePath("/login")
//                .setContentType(ContentType.JSON)
//                /*.log(LogDetail.URI)*/.build();
    }

//    public LoginTicket authorization(User user) {
//        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//        Response response = given(requestSpecification)
//                .body(gson.toJson(user))
//                .post().then().statusCode(200)
//                .extract().response();
//
//        LoginTicket ticketResponse = response.as(LoginTicket.class);
//
////        userRequest.setTicket(ticketResponse.getData().getTicket());
//        RestAssured.authentication = preemptive().basic(userRequest.getUsername(),userRequest.getPassword());
//user.setTicket(response.body().jsonPath().get("ticket"));
//        return ticketResponse;
//    }

//    public Response checkTheValidityOfTheTicket(LoginTicket loginTicket) {
//
//        String ticket = loginTicket.getData().getTicket();
//           return given(requestSpecification)
//                   .contentType(ContentType.XML)
//                   .basePath("/login/ticket/")
//                   .get(ticket);
//    }
}
