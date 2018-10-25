/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.parcial.clima.Clima.persistence.impl;

import arsw.parcial.clima.Clima.persistence.ClimaPersistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("Weather")
public class ClimaConnection implements ClimaPersistence{
    
    
    private final Map<String,String> cache = new HashMap<>();
    /**
     *
     * @param city
     * @return
     * @throws IOException
     */
    @Override
    public String getDaily(String city) throws IOException{
//        String dar="";
//        if(!cache.containsKey(city)){
//          String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=56588615209fd4462f441926ef4d3b4b";
//          dar =getAPIString(url);
//          cache.put(city,dar);
//        }else{
//           dar = cache.get("city");
//        }
//        return dar;
           String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=56588615209fd4462f441926ef4d3b4b";
          return getAPIString(url);
    }
    
    public String getAPIString(String url) throws IOException {

        String USER_AGENT = "Mozilla/5.0";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            return "GET request not worked";
        }
    }

    
    
}

