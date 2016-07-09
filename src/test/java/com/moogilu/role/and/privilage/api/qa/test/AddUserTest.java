package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.AddUserRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.CheckPermissionsRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class AddUserTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "user";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        AddUserRequestModel addUserRequestModel = new AddUserRequestModel();
        addUserRequestModel.name = Constant.NAME;
        addUserRequestModel.email = Constant.EMAIL;
        addUserRequestModel.username = Constant.USER_NAME;
        addUserRequestModel.password = Constant.PASSWORD;

        Send.send(headers, getAsString(addUserRequestModel),url,requestMethod);
    }

}
