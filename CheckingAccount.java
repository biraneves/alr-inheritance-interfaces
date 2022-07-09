public class CheckingAccount extends Account {

    public CheckingAccount(int agency, int number, Customer accountHolder) {

        super(agency, number, accountHolder);

    }

    @Override
    public boolean withdraw(double amount) {

        double withdrawValue = amount + 0.20;

        return super.withdraw(withdrawValue);

    }

}