public class Manager extends Employee {

    private int password;

    public Manager(String name, String id, double salary) {

        super(name, id, salary);

    }

    public boolean authenticate(int password) {

        if (this.password == password)
            return true;
        
        return false;

    }

    public void setPassword(int password) {

        this.password = password;

    }

    public double getBonus() {

        return super.getSalary();

    }

}