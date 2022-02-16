package feb09;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        File file=new File("src/feb09/Abc.txt");
        try {
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write("todays session is over");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
