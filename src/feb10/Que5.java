package feb10;

import java.io.*;

public class Que5 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {

            inputStream = new FileInputStream("src/feb10/file1.txt");
            outputStream = new FileOutputStream("src/feb10/file2.txt");

        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
            }
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
            }
        }
    }
}
