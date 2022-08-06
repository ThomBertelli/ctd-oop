public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Marcos","Fernandes","554875",900.00);
        Cliente cliente2 = new Cliente("José","Kistner","487687",500.00);
        Cliente cliente3 = new Cliente("Maria","Lagerda","578741",1000);


        try{
            cliente1.comprar(1000.00);
        }
        catch (ContaException exception){
            System.err.println(exception.getMessage());
        };

        System.out.println(cliente1);

        try{
            cliente2.comprar(400);
        }
        catch (ContaException exception){
            System.err.println(exception.getMessage());
        };

        System.out.println(cliente2);


        try{
            cliente2.pagarDivida(500);
        }
        catch (ContaException exception){
            System.err.println(exception.getMessage());
        };
        System.out.println(cliente2);

        try{
            cliente3.pagarDivida(500);
        }
        catch (ContaException exception){
            System.err.println(exception.getMessage());
        };
        System.out.println(cliente3);
    }
}