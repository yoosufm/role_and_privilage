package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.GrantAllPermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.GrantMultiplePermissionRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class GrantMultiplePermissionTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "permission";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        GrantMultiplePermissionRequestModel grantMultiplePermissionRequestModel = new GrantMultiplePermissionRequestModel();
        grantMultiplePermissionRequestModel.id = Constant.FEATURE_ID;
        grantMultiplePermissionRequestModel.read = Constant.READ;
        grantMultiplePermissionRequestModel.write = Constant.WRITE;

        Send.send(headers, getAsString(grantMultiplePermissionRequestModel),url,requestMethod);
    }

}
