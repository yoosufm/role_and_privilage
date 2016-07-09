package com.moogilu.role.and.privilage.api.qa.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moogilu.role.and.privilage.api.qa.requests.RequestBase;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
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
    protected String token = "";
    protected String user_id = "";
    protected int userId = 0;

    @BeforeClass
    public void initBaseClass(){
        setHeaders();
    }

    public void  setHeaders(){
        headers = new HashMap<String, String>();
        headers.put("Content-type", "application/json");
        if(!url.equalsIgnoreCase("login")){
            headers.put("x-access-token", token);
            headers.put("x-user-id", user_id);

        }
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

    public String getAPIToken(String response) {
        try {
            JSONObject responseBody = new JSONObject(response);
            token = responseBody.getJSONObject("data").getString("token");
        }catch (JSONException e){
//            e.printStackTrace();
        }finally {
            return token;
        }
    }

    public  String getUserId(String response) {
        try {
            JSONObject responseBody = new JSONObject(response);
            user_id = responseBody.getJSONObject("data").getString("user_id");
        }catch (JSONException e){
//            e.printStackTrace();
        }finally {
            return user_id;
        }
    }
}
