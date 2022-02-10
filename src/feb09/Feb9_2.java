package feb09;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Feb9_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("src/feb09/ip.txt");
        DataInputStream obj1 = new DataInputStream(f);
        int cnt = f.available();
        byte[] b = new byte[cnt];
        obj1.read(b);
        for (byte p:b) {
            System.out.print((char)p);

        }

    }
}