package AssociationExample;

import java.util.ArrayList;

public class BankDemo {
    public static void main(String[] args) {
        Customer c1=new Customer("1","ABC","SBI");
        Customer c2=new Customer("2","ABE","AXIS");
        Customer c3=new Customer("3","ABD","ICICI");
        Customer c4=new Customer("4","ABE","HDFC");
        Customer c5=new Customer("5","AFE","HDFC");

        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);


        ABXBank bank =new ABXBank("ABDF6898","SBI",customers);
        System.out.println("Customer Calling ID: "+ bank.addCustomer(c5));
        System.out.println("Search Customer :"+bank.searchCustomer(c5));

        }
}
