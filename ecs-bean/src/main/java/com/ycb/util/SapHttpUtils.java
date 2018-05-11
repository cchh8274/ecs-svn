package com.ycb.util;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Created by chenghui on 2018/5/11.
 */
public class SapHttpUtils  extends HttpUtils{


    public static boolean sapsubmitPost(String url, String paramContent) {
        boolean responseMessage = false;
        URLConnection connection = null;
        URL reqUrl = null;
        OutputStreamWriter reqOut = null;
        InputStream in = null;
        String param = paramContent;
        try {
            reqUrl = new URL(url);
            connection = reqUrl.openConnection();
            connection.setDoOutput(true);
            Map<String,List<String>> keys=connection.getHeaderFields();
            String  resPonseCode=null;
            for (String k : keys.keySet()) {
                if(k == null){
                    resPonseCode=keys.get(k).get(1);
                    break;
                }

            }
            if(resPonseCode.equals("200")||resPonseCode.equals("202")){
                responseMessage=true;
            }
        } catch (Exception var18) {
        } finally {
            try {
                in.close();
                reqOut.close();
            } catch (Exception var17) {
            }

        }
        return responseMessage;
    }

}
