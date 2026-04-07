import java.net.*;
import java.io.*;

public class ApiPost {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("POST");
            con.setDoOutput(true);

            String data = "{\"title\":\"test\",\"body\":\"hello\",\"userId\":1}";

            OutputStream os = con.getOutputStream();
            os.write(data.getBytes());
            os.flush();
            os.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}