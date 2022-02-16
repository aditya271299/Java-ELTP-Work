package feb09;
import java.io.*;

public class WriteMultipleTimes {
    public static void main(String[] args) {
        File file1 =new File("src/feb09/abc1.txt");
        File file2 =new File("src/feb09/abc2.txt");
        File file3 =new File("src/feb09/abc3.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
         try {
              FileWriter fileWriter1=new FileWriter("src/feb09/abc1.txt");
                fileWriter1.write("learning file handling");
                FileWriter fileWriter2=new FileWriter("src/feb09/abc2.txt");
                fileWriter2.write("learning file handling");
                FileWriter fileWriter3=new FileWriter("src/feb09/abc3.txt");
                fileWriter3.write("learning file handling");
                fileWriter1.close();
                fileWriter2.close();
                fileWriter3.close();
            } catch (IOException e) {
                     e.printStackTrace();
        }
    }
}
