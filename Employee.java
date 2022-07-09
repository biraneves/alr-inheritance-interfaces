public abstract class Employee {

    private String name;
    private String id;
    private double salary;

    public abstract double getBonus();

    public Employee(String name, String id, double salary) {

        this.name = name;
        this.id = id;
        this.salary = (salary > 0 ? salary : 0.0);

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getId() {

        return id;

    }

    public double getSalary() {

        return salary;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

}