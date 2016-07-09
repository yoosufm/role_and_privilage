package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.GrantAllPermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.RevokeAllPermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class RevokeAllPermissionTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "permission/all";
        requestMethod = "DELETE";
    }

    @Test
    public void testLogin(){
        RevokeAllPermissionRequestModel revokeAllPermissionRequestModel = new RevokeAllPermissionRequestModel();
        revokeAllPermissionRequestModel.read = Constant.READ;
        revokeAllPermissionRequestModel.write = Constant.WRITE;

        Send.send(headers, getAsString(revokeAllPermissionRequestModel),url,requestMethod);
    }

}
