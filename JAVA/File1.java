import java.io.*;
import java.util.Date;

class File1 {
    public static void main(String[] arg) {
        File file = new File("./data.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.lastModified());
        System.out.println(file.getPath());
        System.out.println(file.length());
        Date d = new Date(file.lastModified());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println((d.getDate()) + "\\" + (d.getMonth() + 1) + "\\" + (d.getYear() + 1900));
    }
}

/*
 * c:\mydata\data.txt
 * c:\java\File1.java
 * 
 * ..\mydata\data.txt
 * 
 * c:\data.txt
 * c:\java\File1.java
 * ..\data.txt
 * 
 * 
 * 
 */