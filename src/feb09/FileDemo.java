package feb09;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
    public static void main(String args[]){

        File f=new File("src/feb09/Abc.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("file was not created");
            e.printStackTrace();
        }
        if(f.exists()){
            System.out.println("File Exists");
            System.out.println("File path 1 is::"+f.getAbsolutePath());
            System.out.println("File path 2 is::"+f.getPath());
            System.out.println("File name is::"+f.getName());
            System.out.println("File parent is::"+f.getParent());
            System.out.println("File Parent is::"+f.getParentFile());
            System.out.println("File property:read=="+f.canRead());
            System.out.println("file property:write=="+f.canWrite());
            System.out.println("File property:execute=="+f.canExecute());

        }
        else
            System.out.println("File Does not exists");
    }
}
