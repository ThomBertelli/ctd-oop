public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente("66565","Matheus" , "454545", "6456565656");

        ContaPoupanca contap1 = new ContaPoupanca(cliente1, 455.45, 0.05f);

        System.out.println(contap1);

        contap1.depositar(44);

        System.out.println(contap1);

        contap1.sacar(90);

        System.out.println(contap1);

        contap1.cobrarJuros();

        System.out.println(contap1);


    }
}
