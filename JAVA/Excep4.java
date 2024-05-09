
/*
 Checked Exception
 */
import java.io.*;

class Excep4 {
    public static void main(String[] arg) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            // The readLine method can be used only if the checked Exception
            // IOException is handled
            dis.readLine();
        } catch (IOException ioe) {

        }

    }
}