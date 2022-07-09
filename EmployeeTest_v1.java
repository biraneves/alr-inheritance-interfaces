class EmployeeTest {

    public static void main(String[] args) {
        
        Employee nico = new Manager("Nico Steppat", "123.456.789-10", 5000.0);

        System.out.println(nico.getName());
        System.out.println(nico.getBonus());

    }

}