package com.moogilu.role.and.privilage.api.qa.util;

import com.moogilu.role.and.privilage.api.qa.common.Constant;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;


/**
 * Created by mohammedy on 7/5/16.
 */
public class Send {

    public static HttpResponse send(String request, String path){
        HttpResponse response = null;
        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(Constant.URL);

            StringEntity input = new StringEntity(request + path);
            input.setContentType("application/json");
            post.setEntity(input);

            response = client.execute(post);

            System.out.println(response.getStatusLine());
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return response;
        }
    }

}
