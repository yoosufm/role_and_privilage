package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.requests.CheckPermissionsRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.GetAllPermissionsRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class CheckPermissionTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "permission/id";
        requestMethod = "GET";
    }

    @Test
    public void testLogin(){
        CheckPermissionsRequestModel checkPermissionsRequestModel = new CheckPermissionsRequestModel();

        Send.send(headers, "",url,requestMethod);
    }

}
