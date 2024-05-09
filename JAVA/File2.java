import java.io.*;

class File2 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        file.delete();
    }
}
