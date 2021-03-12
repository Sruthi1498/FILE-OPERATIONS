import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestFile {
    public static void main(String[] args) {
        try{

        URL u = new URL("https://www.geeksforgeeks.org/");
        HttpURLConnection h = (HttpURLConnection)u.openConnection();
        System.out.println(h.getResponseCode());

        if(h.getResponseCode() == 200)
                if (h.getResponseCode() == 200) {
                    InputStream i = h.getInputStream();
                    StringBuffer sb = new StringBuffer();
                    BufferedReader br = new BufferedReader(new InputStreamReader(i));

                    FileOutputStream f = new FileOutputStream("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text3.txt");
                    BufferedWriter b = new BufferedWriter(new OutputStreamWriter(f));

                    String s = br.readLine();

                    while (s != null) {
                        System.out.println(s);
                        b.write(s);
                        b.newLine();
                        s = br.readLine();
                    }
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

    }
}
