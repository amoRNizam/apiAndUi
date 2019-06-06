package api.controllers;

import alfresco.s.api.login.models.ServiceMobileDocuments;
import alfresco.s.api.login.user.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static base.utils.Utils.getTimeStamp;
import static io.restassured.RestAssured.given;


public class ServiceMobileDocumentsController {

    private RequestSpecification requestSpecification;

    public ServiceMobileDocumentsController() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://172.30.48.50:8080/alfresco")
                .setBasePath("/service/mobile/documents")
                .setContentType(ContentType.JSON)
                .log(LogDetail.URI).build();
    }

    public ServiceMobileDocuments getDocument(User user) {
       ResponseBody response = given(requestSpecification)
               .param("timestamp", getTimeStamp())
               .sessionId(user.getTicket())
               .get()
               .then()
               .extract().response();
            response.prettyPrint();
            Gson gson= new Gson();
            JsonReader json = new JsonReader(new InputStreamReader(response.asInputStream(), StandardCharsets.UTF_8));
            ServiceMobileDocuments ser = gson.fromJson(json,ServiceMobileDocuments.class);
            System.out.println(ser.toString());
            return ser;
    }

}
