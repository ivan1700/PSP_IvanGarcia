import java.io.IOException;

public class ejer2 {
    public static void main(String[] args) {
        try {
            Process p =Runtime.getRuntime().exec("");
            p.waitFor();
            System.out.println("El proceso a terminado con exito.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
