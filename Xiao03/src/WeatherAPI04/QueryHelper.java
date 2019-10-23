package WeatherAPI04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class QueryHelper {
    /**
    * txt|jsonp|xml
    */
    public static String DATATYPE = "text";

    public static String get(String urlString, String token) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            conn.setReadTimeout(5 * 1000);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setInstanceFollowRedirects(false);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("token", token);
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                StringBuilder builder = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(
                            conn.getInputStream(), "utf-8"));

                for (String s = br.readLine(); s != null; s = br.readLine()) {
                    builder.append(s);
                }
                br.close();
                return builder.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String queryWeather(String code) {
        String url = "http://api.ip138.com/weather/="+code;
        String token = "c1dd42049a489b73a39d4fcca47454f4";
        String js = get(url, token);
        System.out.println(js);
        System.out.println(get(url, token));
        return get(url, token);
    }
}
