public class InternalSystem {

    private int password = 2222;
    
    public void authenticate(Manager m) {

        boolean isAuthenticated = m.authenticate(this.password);

        if (isAuthenticated) {

            System.out.println("Pode entrar no sistema!");

        } else {

            System.out.println("Não pode entrar no sistema!");

        }

    }

}