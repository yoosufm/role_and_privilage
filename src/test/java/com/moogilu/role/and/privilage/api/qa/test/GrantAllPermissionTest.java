package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.GrantAllPermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.GrantPermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class GrantAllPermissionTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "permission/all";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        GrantAllPermissionRequestModel grantAllPermissionRequestModel = new GrantAllPermissionRequestModel();
        grantAllPermissionRequestModel.read = Constant.READ;
        grantAllPermissionRequestModel.write = Constant.WRITE;

        Send.send(headers, getAsString(grantAllPermissionRequestModel),url,requestMethod);
    }

}
