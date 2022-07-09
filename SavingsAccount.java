public class SavingsAccount extends Account {

    public SavingsAccount(int agency, int number, Customer accountHolder) {

        super(agency, number, accountHolder);

    }

    public void deposit(double amount) {

        if (amount > 0)
            super.balance += amount;

    }

}