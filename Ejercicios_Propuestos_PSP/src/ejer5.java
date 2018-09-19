import java.io.IOException;

public class ejer5 {
    public static void main(String[] args) {


            for (String s:args
                 ) {
                try {
                    Process p=Runtime.getRuntime().exec(s);
                    p.waitFor();



                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Aplicaciónes finalizadas");

    }
    }

