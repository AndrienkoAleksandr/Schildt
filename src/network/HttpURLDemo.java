package network;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by USER on 02.07.2014.
 */
public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.com");
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        System.out.println("Method request: " + huc.getRequestMethod());
        System.out.println("Code request " + huc.getResponseCode());
        System.out.println("Answer requst " + huc.getResponseMessage());
        Map<String, List<String>> hdrMap = huc.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        for (String k: hdrField) {
            System.out.println("Key " + k + "Value " + hdrMap.get(k));
        }
    }
}
