package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.requests.GetAllPermissionsRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class GetAllPermissionTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "permission";
        requestMethod = "GET";
    }

    @Test
    public void testLogin(){
        GetAllPermissionsRequestModel getAllPermissionsRequestModel = new GetAllPermissionsRequestModel();

        Send.send(headers, "",url,requestMethod);
    }

}
