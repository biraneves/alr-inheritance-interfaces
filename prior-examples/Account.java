public class Account {

    private double balance;
    private int agency;
    private int number;
    private Customer accountHolder;
    private static int total = 0;

    public Account(int agency, int number) {

        Account.total++;
        System.out.println("The total number of accounts is " + Account.total);

        this.agency = agency;
        this.number = number;
        this.balance = 100;
        System.out.println("Creating account number " + this.number);

    }

    public void deposit(double amount) {

        if (amount > 0) {

            this.balance += amount;

        }

    }

    public boolean withdraw(double amount) {

        if (this.balance >= amount) {

            this.balance -= amount;
            return true;

        }

        return false;

    }

    public boolean transfer(double amount, Account destination) {

        if (this.balance >= amount) {

            this.balance -= amount;
            destination.balance += amount;
            return true;

        }

        return false;

    }

    public double getBalance() {

        return this.balance;

    }

    public int getNumber() {

        return this.number;

    }

    public void setNumber(int number) {

        if (number <= 0) {

            System.out.println("Account number cannot be zero or negative!");
            return;

        }

        this.number = number;

    }

    public int getAgency() {

        return this.agency;

    }

    public void setAgency(int agency) {

        if (agency <= 0) {

            System.out.println("Agency number cannot be zero or negative!");
            return;

        }

        this.agency = agency;

    }

    public void setAccountHolder(Customer accountHolder) {

        this.accountHolder = accountHolder;

    }

    public Customer getAccountHolder() {

        return this.accountHolder;

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