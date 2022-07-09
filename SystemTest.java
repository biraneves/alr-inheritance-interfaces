public class SystemTest {

    public static void main(String[] args) {
        
        Manager m = new Manager("Marcos", "123.456.789-10", 5000.0);
        m.setPassword(2223);

        InternalSystem isys = new InternalSystem();
        isys.authenticate(m);

    }

}