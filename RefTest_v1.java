class RefTest {

    public static void main(String[] args) {
        
        Manager m1 = new Manager("Marcos", "987.654.321-01", 5000.0);
        VideoEditor v1 = new VideoEditor("João", "345.213.777-45", 2800.0);

        BonusControl bc = new BonusControl();
        bc.register(m1);
        bc.register(v1);

        System.out.println(bc.getSum());

    }

}