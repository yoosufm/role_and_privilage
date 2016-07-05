package com.moogilu.role.and.privilage.api.qa.util;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.moogilu.role.and.privilage.api.qa.common.Constant;

import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by mohammedy on 7/5/16.
 */
public class Send {

    public static String send(Map<String, String> headers, String body, String uri, String requestMethod){
        RestAssured.baseURI = Constant.URL;
        RestAssured.basePath = Constant.BASE_PATH;
        RestAssured.port = Constant.PORT;

        RequestSpecification requestSpecification = RequestUtil.getRequestSpec(headers, body);
        requestSpecification = given().spec(requestSpecification);
         return execute(requestMethod, requestSpecification, "login");
    }

    public static String execute(String reqMethod,  RequestSpecification requestSpecification, String uri ){
        Response response = null;
        if(reqMethod.equalsIgnoreCase("GET")) {
            response = (Response) RestAssured.given(requestSpecification).expect().when().get("/" + uri, new Object[0]);
        }if(reqMethod.equalsIgnoreCase("POST")) {
            response = (Response) RestAssured.given(requestSpecification).expect().when().post("/" + uri, new Object[0]);
        }if(reqMethod.equalsIgnoreCase("PUT")) {
            response = (Response) RestAssured.given(requestSpecification).expect().when().put("/" + uri, new Object[0]);
        }if(reqMethod.equalsIgnoreCase("DELETE")) {
            response = (Response) RestAssured.given(requestSpecification).expect().when().delete("/" + uri, new Object[0]);
        }
        return  response.asString();
    }


}
