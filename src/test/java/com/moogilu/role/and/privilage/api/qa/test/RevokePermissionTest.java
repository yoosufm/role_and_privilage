package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.GrantPermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.RevokePermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class RevokePermissionTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "permission/id";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        RevokePermissionRequestModel revokePermissionRequestModel = new RevokePermissionRequestModel();
        revokePermissionRequestModel.read = Constant.READ;
        revokePermissionRequestModel.write = Constant.WRITE;

        Send.send(headers, getAsString(revokePermissionRequestModel),url,requestMethod);
    }

}
