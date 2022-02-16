package feb09;
import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file=new File("src/feb09/Abc.txt");
        try {
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String line= sc.nextLine();
                System.out.print(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
