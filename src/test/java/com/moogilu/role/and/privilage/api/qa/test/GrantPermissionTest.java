package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.AddFeatureRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.GrantPermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class GrantPermissionTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "permission/id";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        GrantPermissionRequestModel grantPermissionRequestModel = new GrantPermissionRequestModel();
        grantPermissionRequestModel.read = Constant.READ;
        grantPermissionRequestModel.write = Constant.WRITE;

        Send.send(headers, getAsString(grantPermissionRequestModel),url,requestMethod);
    }

}
