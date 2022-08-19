package BankAccountExcpetion;

public class AccountDemo {
    public static void main(String[] args) {
        Account a1=new Account(1000,3400,20000);
        Account a2 =new Account(1000,2000,3000);
        System.out.println("Balance ion Deposit of 2000 for a2"+ a2.deposite(2000));
        try{
            System.out.println("Balance on Withdrawal a2 :"+a2.Withdeowl(1000));
            System.out.println( "Balance on Withrawal of a1:");
            System.out.println(a1.Withdeowl(4000));
        } catch (BalanceException e) {

        }

    }
}
