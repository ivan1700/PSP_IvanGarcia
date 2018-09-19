import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejer4 {
    public static void main(String[] args) {

        try {
            Process p= Runtime.getRuntime().exec(args);

            p.waitFor();
            System.out.println("Aplicación finalizada");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
