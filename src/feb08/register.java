package feb08;

public class register {
        int balance=45000;
        public void  deposit(int amount) throws InvalidAmountException {
            if(amount<=0){
                throw new InvalidAmountException("Entered amount is invalid");
            } else {
                this.balance += amount;
            }
        }
        public  void withdraw(int amount) throws InsufficientBalanceException, InvalidAmountException {
            if (amount<=0){
                throw new InvalidAmountException("invalid amount");
            }
            if (amount >balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            else {
                this.balance-= amount;
            }


    }
}
