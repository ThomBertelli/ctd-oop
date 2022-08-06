public class Main {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(500.00,100.00);


        cc1.setSaldo(cc1.getSaldo() - cc1.imposto(2));

        System.out.println(cc1.informarSaldo());


    }
}