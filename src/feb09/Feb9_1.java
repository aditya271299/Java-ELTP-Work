package feb09;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Feb9_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream( "src/feb09/op.txt");
        DataOutputStream data = new DataOutputStream(file);
        byte[] b = {65,66,67};
        data.write(b);
        data.flush();
        data.close();
        System.out.println("Sucess");
    }


}