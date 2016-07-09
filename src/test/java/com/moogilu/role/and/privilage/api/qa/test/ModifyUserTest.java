package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.AddUserRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.ModiyUserRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class ModifyUserTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "user/id";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        ModiyUserRequestModel modiyUserRequestModel = new ModiyUserRequestModel();
        modiyUserRequestModel.name = Constant.NAME;
        modiyUserRequestModel.email = Constant.EMAIL;
        modiyUserRequestModel.username = Constant.USER_NAME;
        modiyUserRequestModel.password = Constant.PASSWORD;

        Send.send(headers, getAsString(modiyUserRequestModel),url,requestMethod);
    }

}
