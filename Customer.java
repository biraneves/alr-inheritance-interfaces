public class Customer {

    private String name;
    private String id;
    private String profession;
    private static int total = 0;

    public Customer(String name, String id, String profession) {

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

}