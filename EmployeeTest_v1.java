class EmployeeTest {

    public static void main(String[] args) {
        
        Employee nico = new Employee();
        nico.setName("Nico Steppat");
        nico.setId("123.456.789-10");
        nico.setSalary(2600.00);

        System.out.println(nico.getName());
        System.out.println(nico.getBonus());

    }

}