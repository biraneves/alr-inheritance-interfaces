public class Customer implements Authenticable {

    private String name;
    private String id;
    private String profession;
    private AuthenticationUtil authenticator;
    private static int total = 0;

    public Customer(String name, String id, String profession) {

        this.authenticator = new AuthenticationUtil();
        
        Customer.total++;
        this.name = name;
        this.id = id;
        this.profession = profession;

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

    public String getProfession() {

        return profession;

    }

    public void setProfession(String profession) {

        this.profession = profession;

    }

    public static int getTotal() {

        return Customer.total;

    }

    public String toString() {

        String s = name + " (" + id + ")";

        return s;

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