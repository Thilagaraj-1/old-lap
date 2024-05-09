import java.io.*;

class File6 {
    public static void main(String[] arg) throws Exception {
        FileOutputStream fos = new FileOutputStream("data2.txt", false);

        String str = "This is a demo Hello World Mother Earth";
        byte[] data = str.getBytes();

        fos.write(data);

        fos.close();
    }
}