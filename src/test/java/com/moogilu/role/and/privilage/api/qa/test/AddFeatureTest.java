package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.AddFeatureRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.AddUserRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class AddFeatureTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "feature";
        requestMethod = "POST";
    }

    @Test
    public void testLogin(){
        AddFeatureRequestModel addFeatureRequestModel = new AddFeatureRequestModel();
        addFeatureRequestModel.name = Constant.FEATURE_NAME;

        Send.send(headers, getAsString(addFeatureRequestModel),url,requestMethod);
    }

}
