package DemoCodeSet;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoSet {
    public static void main(String[] args) {
        ArrayList<Account> accounts= new ArrayList<Account>();
        HashSet<Integer> custId =new HashSet<Integer>();

        Account a=new Account(1010,1010.5,1001);
        Account a1=new Account(1010,1010.5,1002);
        Account a2=new Account(1010,1010.5,1006);
        Account a3=new Account(1010,1010.5,1006);
        Account a4=new Account(1010,1010.5,1005);
        accounts.add(a);
        accounts.add(a2);
        accounts.add(a3);
        accounts.add(a4);
        accounts.add(a1);

        custId=DemoSet.getUniqueID(accounts);
        System.out.println("Unique Customer ID's are :" +custId);

    }

    public  static HashSet<Integer> getUniqueID( ArrayList<Account> accounts){
        HashSet<Integer> cost=new HashSet<Integer>();

        for (Account a: accounts){
            cost.add(a.getCustomerId());
        }
        return cost;
    }

}
