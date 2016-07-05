package com.moogilu.role.and.privilage.api.qa.util;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.specification.RequestSpecification;

import java.util.Map;

/**
 * Created by mohammedy on 7/5/16.
 */
public class RequestUtil {

    public static RequestSpecification getRequestSpec(Map<String, String> headers, String body){
        RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();
        reqSpecBuilder.addHeaders(headers);
        reqSpecBuilder.setBody(body);
        return reqSpecBuilder.build();
    }

}
