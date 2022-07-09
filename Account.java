public abstract class Account {

    protected double balance;
    private int agency;
    private int number;
    private Customer accountHolder;
    private static int total = 0;

    public Account(int agency, int number, Customer accountHolder) {

        Account.total++;

        this.agency = agency;
        this.number = number;
        this.accountHolder = accountHolder;
        this.balance = 0;

    }

    public abstract void deposit(double amount);

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

    public String toString() {

        String s = "Customer: " + accountHolder.getName() + " - Agency: " + agency +
            " - Acc. number: " + number;

        return s;

    }

}