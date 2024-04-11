package new02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class Network03 {

	public static void main(String[] args) {
        URL url = null;
        String addr = "https://lovelosome.co.kr/";
        BufferedReader input = null;
        String line = "";

        try {
            url = new URL(addr); // Use the addr variable here instead of "addr"
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            input.close();
        } catch (Exception e) {
            // Print the exception stack trace to see what went wrong
            e.printStackTrace();
        }
    }

}
