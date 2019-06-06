package api.test;

import alfresco.s.api.login.models.ServiceMobileDocuments;
import alfresco.s.api.login.user.User;
import api.controllers.ServiceMobileDocumentsController;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.time.Instant;

import static base.utils.Utils.getUnixDateTime;
import static io.restassured.RestAssured.preemptive;

public class TestLogin {

//    private String TIME_STAMP = getUnixDateTime();
//    public ServiceMobileDocumentsController service;
//    private User user = new User("soglks5", "Qwer1234");
//
//
//    @BeforeMethod
//    public void authUser() {
//        User user = new User("soglks5", "Qwer1234");
//    }
//
//    @Test(enabled = false)
//    public void validTicketTest() {
////        RequestSpecification requestSpecification;
////        requestSpecification = new RequestSpecBuilder().setAuth()
//
//        User user = new User("soglks5","Qwer1234");
//
//        LoginTicket loginTicket = new LoginController().authorization(user);
//
//        RestAssured.authentication = preemptive().basic("soglks5","Qwer1234");
//
//        String BASE_URL = "http://172.30.48.50:8080/alfresco/s/api";
//        String ticket = loginTicket.getData().getTicket();
//
//        RestAssured.given()
//                .baseUri(BASE_URL)
//                .basePath("/login/ticket/"+ticket)
////                .header("Authorization", ticket)
//                .get()
//                .then()
////                .statusCode(200)
//                .extract().response().prettyPrint();
//    }
//
//    @Test(enabled = false)
//    public void loginTest() {
//        User user = new User("soglks5", "Qwer1234");
//
//        LoginTicket loginResponse = new LoginController().authorization(user);
//        assertThat(loginResponse.getData().getTicket()).isNotNull();
//    }
//
//    @Test(enabled = false)
//    public void checkValidTicketTest() {
//        User user = new User("soglks5", "Qwer1234");
//
//        LoginTicket loginResponse = new LoginController().authorization(user);
//        Response responseTicket = new LoginController().checkTheValidityOfTheTicket(loginResponse);
//        assertThat(responseTicket.statusCode()).isEqualTo(200);
//
//        responseTicket.prettyPrint();
//
//        // негативная проверка для другого кейса
////        LoginTicketNotFound loginTicketNotFound = responseTicket.as(LoginTicketNotFound.class);
////        System.out.println(loginTicketNotFound.getMessage());
////        assertThat(loginTicketNotFound.getMessage()).isEqualTo("Ticket not found");
//    }
//
//    @Test(enabled = true)
//    public void getDocuments() throws UnsupportedEncodingException {
//        ServiceMobileDocumentsController serviceMobileDocumentsController = new ServiceMobileDocumentsController();
//        LoginTicket loginResponse = new LoginController().authorization(user);
//        ServiceMobileDocuments doc = new ServiceMobileDocuments();
//        doc =serviceMobileDocumentsController.getDocument();
//        System.out.println(doc.getItems().get(3).getNodeRef());
//
//        System.out.println(doc.getItems().get(3).getCmModified());
//    }

}
