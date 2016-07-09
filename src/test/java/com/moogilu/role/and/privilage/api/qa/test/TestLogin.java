package com.moogilu.role.and.privilage.api.qa.test;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.*;
import com.moogilu.role.and.privilage.api.qa.responses.LoginResponseModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.UUID;

/**
 * Created by mohammedy on 7/5/16.
 */
public class TestLogin extends TestBase {

    String response = "";

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

        response = Send.send(headers, getAsString(loginRequest),url,requestMethod);
        System.out.println(response);
    }

    @Test(dependsOnMethods = "testLogin")
    public void testAddUser(){
        url = "user";
        token = getAPIToken(response);
        user_id = getUserId(response);
        setHeaders();
        AddUserRequestModel addUserRequestModel = new AddUserRequestModel();
        addUserRequestModel.name = getUserName();
        addUserRequestModel.email = addUserRequestModel.name + Constant.EMAIL;
        addUserRequestModel.username = addUserRequestModel.name;
        addUserRequestModel.password = addUserRequestModel.name;

        response =  Send.send(headers, getAsString(addUserRequestModel),url,requestMethod);
        System.out.println(response);
    }

    @Test(dependsOnMethods = "testAddUser")
    public void testEditUser(){
        userId = Integer.parseInt(getUserId(response));
        url = "user/" + userId;
        ModiyUserRequestModel modiyUserRequestModel = new ModiyUserRequestModel();
        modiyUserRequestModel.name = getUserName();
        modiyUserRequestModel.email = modiyUserRequestModel.name + Constant.EMAIL;
        modiyUserRequestModel.username = modiyUserRequestModel.name;
        modiyUserRequestModel.password = modiyUserRequestModel.name;

        response =  Send.send(headers, getAsString(modiyUserRequestModel),url,requestMethod);
        System.out.println(response);
    }

    @Test(dependsOnMethods = "testEditUser")
    public void testViewUser(){
        url = "user/" + userId;
        ViewUsersRequestModel viewUsersRequestModel = new ViewUsersRequestModel();

        response =  Send.send(headers, getAsString(viewUsersRequestModel),url,requestMethod);
        System.out.println(response);
    }

    @Test(dependsOnMethods = "testViewUser")
    public void testDeleteUser(){
        url = "user/" + userId;
        DeleteUsersRequestModel deleteUsersRequestModel = new DeleteUsersRequestModel();
        deleteUsersRequestModel.user_id = userId;

        response =  Send.send(headers, getAsString(deleteUsersRequestModel),url,requestMethod);
        System.out.println(response);
    }

    private String getUserName(){
        return UUID.randomUUID().toString().split("-")[0];
    }

    private String getToken(){
        JsonObject jsonObject = new JsonObject();
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(response);
        jsonObject = element.getAsJsonObject();
        return jsonObject.get("data").getAsJsonObject().get("token").getAsString();
    }

}
