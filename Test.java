import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.geeksforgeeks.org/");
            HttpURLConnection h = (HttpURLConnection)u.openConnection();
            System.out.println(h.getResponseCode());

            if(h.getResponseCode() == 200)
            {
                InputStream i = h.getInputStream();
                StringBuffer sb = new StringBuffer();
                BufferedReader br = new BufferedReader(new InputStreamReader(i));

                String s = br.readLine();

                while (s!=null)
                {
                    System.out.println(s);
                    s = br.readLine();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
