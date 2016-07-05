package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.LoginRequest;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class TestLogin extends TestBase {
    String jsonInString = "";
    @BeforeClass
    public void init(){
        url = "login";
    }

    @Test
    public void testLogin(){
        ObjectMapper mapper = new ObjectMapper();
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.userName = Constant.USER_NAME;
        loginRequest.password = Constant.PASSWORD;
        try {
            jsonInString = mapper.writeValueAsString(loginRequest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Send.send(jsonInString);
    }

}
