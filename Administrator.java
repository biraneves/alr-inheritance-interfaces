public class Administrator extends Employee implements Authenticable {

    private AuthenticationUtil authenticator;

    public Administrator(String name, String id, double salary) {

        super(name, id, salary);
        this.authenticator = new AuthenticationUtil();

    }

    public double getBonus() {

        return 50;

    }

    @Override
    public void setPassword(int password) {

        this.authenticator.setPassword(password);

    }

    @Override
    public boolean authenticate(int password) {

        return this.authenticator.authenticate(password);
    }

}