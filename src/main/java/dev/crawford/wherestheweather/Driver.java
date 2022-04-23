package dev.crawford.wherestheweather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONException;

public class Driver {
    public static void main(String[] args) {
        
        int zipCode = 72016;

        try {
            URL url = new URL("https://api.weatherapi.com/v1/forecast.json?key=50047350eb664dbf91b30114210706&q=" + zipCode);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            int status = conn.getResponseCode();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            try {
                JSONObject json = new JSONObject(response.toString());
                JSONObject current = json.getJSONObject("current");
                JSONObject location = json.getJSONObject("location");
                

                System.out.println("Current temperature: " + current.getInt("temp_f"));
                // System.out.println("Current condition: " + current.getString("condition"));
                System.out.println("Current location: " + location.getString("name"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            in.close();



        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }
}
