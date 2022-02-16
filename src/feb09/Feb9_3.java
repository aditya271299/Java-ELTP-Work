package feb09;
import java.io.*;
import java.util.Scanner;

public class Feb9_3 {
    public static void main(String args[]) throws FileNotFoundException , IOException {

        FileInputStream f1=new FileInputStream("src/feb09/q2.txt");
        FileInputStream f2=new FileInputStream("src/feb09/q2_1.txt");
        FileOutputStream f3=new FileOutputStream("src/feb09/q2_2.txt");
        System.out.println(f1.available());
        int i=0;
        while((i= f1.read())!=-1);
        f3.close();
        }
    }
