package feb10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Que4 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter w1  = new PrintWriter(new File("src/feb10/abc.txt"));
        w1.write("todays assignment");
        w1.flush();
        w1.close();
        PrintWriter w = new PrintWriter(System.out);
        w.write("learning java");
        w.flush();
        w.close();
    }
}
