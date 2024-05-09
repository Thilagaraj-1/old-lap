import java.io.*;

class File4 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("File4.java");
        /*
         * while(fis.available()!= 0){
         * System.out.print((char) fis.read());
         * }
         * fis.close();
         */

        byte data[] = fis.readAllBytes();
        String str = new String(data);
        System.out.println((char) data[0]);
        System.out.println(str);
        fis.close();
    }
}