import java.io.*;

class File3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            System.out.println(fis.available());
            int d = fis.read();
            char ch = (char) d;
            System.out.println((char) fis.read());
            System.out.println(fis.available());
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
