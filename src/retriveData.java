import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class retriveData {
    public void web(){
        String content = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        URLConnection connection = null;
        try{
            System.out.print("Masukkan URL web (dengan http) =");
            String web =  in.readLine();
            connection = new URL(web).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(content);
    }
}
