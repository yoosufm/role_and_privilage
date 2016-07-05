package com.moogilu.role.and.privilage.api.qa.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moogilu.role.and.privilage.api.qa.requests.RequestBase;
import org.apache.http.entity.StringEntity;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mohammedy on 7/5/16.
 */
public class TestBase {
    protected String url = "";
    protected String requestMethod = "";
    StringEntity stringEntity = null;
    Map<String, String> headers =  null;
    protected String jsonInString = null;

    @BeforeClass
    public void initBaseClass(){
        headers = new HashMap<String, String>();
        headers.put("Content-type", "application/json;charset= ");
        headers.put("Accept","application/json");
    }

    public String getAsString(RequestBase requestBase){
        ObjectMapper mapper = new ObjectMapper();

        try {
            jsonInString = mapper.writeValueAsString(requestBase);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }finally {
            return jsonInString;
        }

    }

}
