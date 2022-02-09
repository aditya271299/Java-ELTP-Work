package feb08;

public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        System.out.println("invalid amount exception");
    }

    public InvalidAmountException(String message) {
        System.out.println(message);
    }

    public InvalidAmountException(String message, Throwable cause) {
        System.out.println(message+cause);
    }

    public InvalidAmountException(Throwable cause) {
        System.out.println(cause);
    }
}
