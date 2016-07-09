package com.moogilu.role.and.privilage.api.qa.test;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import com.moogilu.role.and.privilage.api.qa.requests.AddUserRequestModel;
import com.moogilu.role.and.privilage.api.qa.requests.DeleteUsersRequestModel;
import com.moogilu.role.and.privilage.api.qa.util.Send;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mohammedy on 7/5/16.
 */
public class DeleteUserTest extends TestBase {
    @BeforeClass
    public void init(){
        url = "user/id";
        requestMethod = "DELETE";
    }

    @Test
    public void testLogin(){
        DeleteUsersRequestModel deleteUsersRequestModel= new DeleteUsersRequestModel();
        deleteUsersRequestModel.user_id = Constant.USER_ID;

        Send.send(headers, getAsString(deleteUsersRequestModel),url,requestMethod);
    }

}
