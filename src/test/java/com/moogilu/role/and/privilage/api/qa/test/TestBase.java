package com.moogilu.role.and.privilage.api.qa.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moogilu.role.and.privilage.api.qa.requests.RequestBase;

/**
 * Created by mohammedy on 7/5/16.
 */
public class TestBase {
    protected String url = "";
    protected String jsonInString = "";


    public String getAsString(RequestBase requestBase){
        ObjectMapper mapper = new ObjectMapper();

        try {
            jsonInString = mapper.writeValueAsString(requestBase);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }finally {
            return jsonInString;
        }

    }

}
