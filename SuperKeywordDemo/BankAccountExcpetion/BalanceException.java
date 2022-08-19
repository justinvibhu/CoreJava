package BankAccountExcpetion;

public class BalanceException extends Throwable {
    public BalanceException(String s) {
        System.out.println(s);
    }
}
