package feb08;
import java.util.Scanner;
public class Transaction {
    public static void main(String[] args) throws InvalidAmountException, InsufficientBalanceException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the type of transaction : withdrawl/deposit");
        String transaction = sc.nextLine();
        register obj_1 = new register();
        try {
            if (transaction.equals("withdrawl")) {
                System.out.println("enter the amount");
                int amt= sc.nextInt();
                obj_1.withdraw(amt);
        }
        }
         catch (InsufficientBalanceException e){
             System.out.println("withdrawl unsuccessful");
         }
            try {
                if (transaction.equals("deposit")) {
                    System.out.println("enter the amount");
                    int amt = sc.nextInt();
                    obj_1.deposit(amt);
                }
        }
            catch (InvalidAmountException e){
                System.out.println("deposit unsuccessful");
            }
        if (!transaction.equals("deposit") && !transaction.equals("withdrawl")){
            System.out.println("wrong input");
        }
    }
}
