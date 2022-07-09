public abstract class Account {

    private double balance;
    private int agency;
    private int number;
    private Customer accountHolder;
    private static int total = 0;

    public Account(int agency, int number) {

        Account.total++;

        this.agency = agency;
        this.number = number;
        this.balance = 0;

    }

    public void deposit(double amount) {

        if (amount > 0)
            balance += amount;

    }

    public boolean withdraw(double amount) {

        if (balance >= amount) {

            balance -= amount;
            return true;

        }

        return false;

    }

    public boolean transfer(double amount, Account destination) {

        if (balance >= amount) {

            this.withdraw(amount);
            destination.deposit(amount);
            return true;

        }

        return false;

    }

    public double getBalance() {

        return balance;

    }

    public int getNumber() {

        return number;

    }

    public int getAgency() {

        return agency;

    }

    public Customer getAccountHolder() {

        return accountHolder;

    }

    public static int getTotal() {

        return Account.total;

    }

}