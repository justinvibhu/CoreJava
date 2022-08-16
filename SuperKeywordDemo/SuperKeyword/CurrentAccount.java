package SuperKeyword;

public class CurrentAccount extends Account{

    private  final int minBalence=5000;
    public CurrentAccount(int accountId, int customerId, double balence) {
        super(accountId, customerId, balence);

    }
}
