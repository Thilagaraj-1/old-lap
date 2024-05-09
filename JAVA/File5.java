import java.io.*;

class File5{
    /*
    public static void main(String[] arg){
        try{
            FileOutputStream fos = new FileOutputStream("data1.txt");
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }catch(IOException ioe){
               ioe.printStackTrace();
        }
        
    } 
    */
    // public static void main(String[] arg) throws FileNotFoundException, IOException{
        public static void main(String[] arg) throws Exception{
      
        FileOutputStream fos = new FileOutputStream("data1.txt", true);

        char ch = 'X';
        int ci = (int) ch;

        fos.write(ci);
        fos.close();
        
        
    }     
}