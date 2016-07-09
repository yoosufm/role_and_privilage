package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.requests.GetAllPermissionsRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.ViewAllUsersRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class ViewAllUserTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "user";
        requestMethod = "GET";
    }

    @Test
    public void testLogin(){
        ViewAllUsersRequestModel viewAllUsersRequestModel = new ViewAllUsersRequestModel();

        Send.send(headers, "",url,requestMethod);
    }

}
