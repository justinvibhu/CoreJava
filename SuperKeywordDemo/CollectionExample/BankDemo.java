package CollectionExample;

import java.util.ArrayList;

public class BankDemo {
    public static void main(String[] args) {
        ArrayList<Account> accountList=new ArrayList<>();
        Account a1=new Account(101,5000,32440);
        Account a2=new Account(102,3000,48383);
        Account a3=new Account(103,2000,78937);
        accountList.add(a1);
        accountList.add(a2);
        accountList.add(a3);
        Bank b=new Bank(accountList);
        b.Deposite(25000,32440);
        b.Withdraw(5000,32440);

        b.Deposite(257400,101);
        b.Withdraw(5000,102);
        b.Deposite(250900,48383);
        b.Withdraw(5000,48383);


    }
}
