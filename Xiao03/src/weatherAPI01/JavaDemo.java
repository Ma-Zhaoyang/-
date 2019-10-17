package weatherAPI01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
 
import net.sf.json.JSONObject;
 
public class JavaDemo {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
 
    //�����������KEY
    public static final String APICODE ="123456";
 
    //1.API����
    public static void getRequest(){
        String result =null;
        String url ="https://api.yonyoucloud.com/apis/dst/weatherResearch/weatherCurrent";//����ӿڵ�ַ
        String method = "POST";
        String paramFormat = "form";
        Map<String, Object> params = new HashMap<String, Object>();//�������
        params.put("����", "");
 
        Map<String, Object> headerParams = new HashMap<String, Object>();//����ͷ����
        headerParams.put("apicode", APICODE);//APICODE
        headerParams.put("trantype", "code");
 
        try {
            result = net(url, params, headerParams, method, paramFormat);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     *
     * @param strUrl �����ַ
     * @param params �������
     * @param method ���󷽷�
     * @return  ���������ַ���
     * @throws Exception
     */
    public static String net(String strUrl, Map<String,Object> params, Map<String,Object> headerParams,String method, String paramFormat) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            String contentType = null;
            if(headerParams.containsKey("Content-Type"))
                contentType = headerParams.get("Content-Type").toString();
                 
            StringBuffer sb = new StringBuffer();
            if(method==null || method.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(method==null || method.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            for (String i : headerParams.keySet()) {
                conn.setRequestProperty(i, headerParams.get(i).toString());
            }
            if("form".equals(paramFormat) && !"application/x-www-form-urlencoded".equals(contentType) && !"application/xml".equals(contentType)) {
                conn.setRequestProperty("Content-Type", "application/json");
            }
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    if("form".equals(paramFormat)) {
                        if("application/x-www-form-urlencoded".equals(contentType))
                            out.writeChars(urlencode(params));
                        else if("application/xml".equals(contentType))
                            out.writeChars(xmlencode(params));
                        else
                            out.writeChars(jsonencode(params));
                    } else
                        out.writeChars(params.get("textData").toString());
                     
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }
     
    //��map��תΪ���������
    public static String urlencode(Map<String,Object>data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                if(("").equals(i.getKey())) {
                    sb.append(URLEncoder.encode(i.getValue()+"","UTF-8"));
                } else {
                    sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
     
    //��map��תΪ���������
    public static String jsonencode(Map<String,Object>data) {
        JSONObject jparam = new JSONObject();
        for (Map.Entry i : data.entrySet())
            jparam.put(i.getKey(), i.getValue());
        return jparam.toString();
    }
     
    //��map��תΪ���������
    public static String xmlencode(Map<String,Object>data) {
        StringBuffer xmlData = new StringBuffer(); 
        xmlData.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        for (Map.Entry i : data.entrySet())
             xmlData.append("<" + i.getKey() + ">" + i.getValue() + "</" + i.getKey() + ">");
         
        return xmlData.toString();
    }
}