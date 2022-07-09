class ManagerTest {

    public static void main(String[] args) {
        
        Manager m1 = new Manager("Marco", "987.654.321-01", 5000.0);

        System.out.println(m1.getName());
        System.out.println(m1.getId());
        System.out.println(m1.getSalary());

        m1.setPassword(2222);
        boolean isAuthenticated = m1.authenticate(2222);

        System.out.println(isAuthenticated);

        System.out.println(m1.getBonus());

    }

}