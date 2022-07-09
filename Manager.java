public class Manager extends Employee implements Authenticable {

    private AuthenticationUtil authenticator;

    public Manager(String name, String id, double salary) {

        super(name, id, salary);
        this.authenticator = new AuthenticationUtil();

    }

    @Override
    public boolean authenticate(int password) {

        return this.authenticator.authenticate(password);

    }

    @Override
    public void setPassword(int password) {

        this.authenticator.setPassword(password);

    }

    public double getBonus() {

        return super.getSalary();

    }

}