public class TestTaxable {

    public static void main(String[] args) {
        
        CheckingAccount cc = new CheckingAccount(222, 333, new Customer("Felipe", "123.456.789-10", "Designer"));
        cc.deposit(100);

        LifeInsurance ins = new LifeInsurance();
        TaxCalculator tx = new TaxCalculator();

        tx.register(cc);
        tx.register(ins);

        System.out.println(tx.getTotalTax());

    }

}