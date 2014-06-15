package finance;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by neo on 15.06.14.
 */
public class FdsRest {




    public static String getRestXml() {


        String request = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.historicaldata%20" +
                "where%20symbol%20%3D%20%22YHOO%22%20and%20startDate%20%3D%20%222013-12-01%22%20and%20endDate%20%3D%20%2220" +
                "13-12-31%22&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";

        HttpClient client = new DefaultHttpClient();

        HttpUriRequest method = new HttpGet(request);


        try {
            HttpResponse response = client.execute(method);

            HttpEntity entity = response.getEntity();

            System.out.println(EntityUtils.toString(entity));

            return response.getEntity().toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;


    }



}
