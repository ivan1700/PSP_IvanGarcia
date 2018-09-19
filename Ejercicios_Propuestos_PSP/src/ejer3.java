import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejer3 {
    public static void main(String[] args) {

        try {
            Process p= Runtime.getRuntime().exec(args);
            InputStream is = p.getInputStream();
            BufferedReader br= new BufferedReader(new InputStreamReader(is));
            String linea=br.readLine();
            while(linea!=br.readLine()){
                System.out.println(linea);
                linea=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
