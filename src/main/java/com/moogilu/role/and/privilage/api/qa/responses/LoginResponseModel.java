package com.moogilu.role.and.privilage.api.qa.responses;

/**
 * Created by yoosuf on 6/6/2015.
 */
public class LoginResponseModel extends ResponseBase {

    public boolean status;
    public int code;
    public String message;
    public int user_id;
    public String access_token;
    public Data data;


}

class Data{
    String user_id;
    String access_token;

}
