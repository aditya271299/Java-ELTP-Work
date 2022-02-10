package feb10;

import java.io.Console;

public class Que3 {
    public static void main(String[] args) {
        Console console   = System.console();
        char[] pass;
        console.format("Enter details - \n");
        String str = console.readLine("Enter your email ");
        pass =console.readPassword("Enter your password ");
        console.printf("details are - \n");
        console.format("Your email is : %s \n", str);
        for(char ch : pass)
            console.printf("%c", ch);
    }
}
