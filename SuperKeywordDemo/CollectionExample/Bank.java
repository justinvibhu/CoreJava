package CollectionExample;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts;

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public double Deposite(double amount , int accountId){
        double finalBalance=0;
        for (Account acc: accounts){
            if(acc.getAccountId()== accountId){
                finalBalance=acc.Diposite(amount);
                System.out.println("Amount Successfully DEPOSITED to your Account, The Amount after Adding is :"+finalBalance);
                return finalBalance;
            }
        }
        System.out.println("Account Does Not Exist");
        return -1;
    }

    public  double Withdraw( double amount , int accountId){
        double finalBalance=0;
        for (Account acc: accounts){
            if(acc.getAccountId()==accountId){
                finalBalance=acc.Withdraw(amount);
                System.out.println("The amount successfully Withdraw , The amount after Withdraw is:"+finalBalance);
                return finalBalance;
            }
        }
        System.out.println("Acount Does not Exist");
        return -1;
    }
}
