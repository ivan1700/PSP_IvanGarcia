import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejer1 {
    public static void main(String[] args) {
        try {
            Process p=Runtime.getRuntime().exec("ipconfig");
            InputStream is= p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea = br.readLine();

            while(linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
