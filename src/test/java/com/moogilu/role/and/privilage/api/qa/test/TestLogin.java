package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.LoginRequest;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class TestLogin extends TestBase {
    @BeforeClass
    public void init(){
        url = "login";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.username = Constant.USER_NAME;
        loginRequest.password = Constant.PASSWORD;

        Send.send(headers, getAsString(loginRequest),url,requestMethod);
    }

}
