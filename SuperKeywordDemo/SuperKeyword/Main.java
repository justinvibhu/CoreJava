package SuperKeyword;

public class Main {
    public static void main(String[] args) {
        SavingAccount sa=new SavingAccount(1,30002,1000);
        System.out.println("AccountId:"+sa.accountId);
        System.out.println("custermId:"+sa.customerId);
        System.out.println("Balence:"+sa.balence);
    }
}
