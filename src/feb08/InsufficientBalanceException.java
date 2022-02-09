package feb08;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        System.out.println("insufficient balance");
    }

    public InsufficientBalanceException(String message) {
        System.out.println(message);
    }

    public InsufficientBalanceException(String message, Throwable cause) {
        System.out.println(message+cause);
    }

    public InsufficientBalanceException(Throwable cause) {
        System.out.println(cause);
    }
}
