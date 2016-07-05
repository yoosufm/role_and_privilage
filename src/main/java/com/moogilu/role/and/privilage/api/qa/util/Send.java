package com.moogilu.role.and.privilage.api.qa.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;


/**
 * Created by mohammedy on 7/5/16.
 */
public class Send {

    public static HttpResponse send(String request){
        HttpResponse response = null;
        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(System.getProperty("api.url", ""));

            StringEntity input = new StringEntity(request);
            input.setContentType("application/json");
            post.setEntity(input);

            response = client.execute(post);

            System.out.println(response.getStatusLine());
        }catch (Exception e){

        }
        finally {
            return response;
        }
    }

}
