import java.util.Scanner;

public class SelecionaTipoPagamento {

    public void perguntaTipoPagamento(){

        Scanner scanner = new Scanner(System.in);

        String tipoPagamento = "0";

        while(!tipoPagamento.equals("1") && !tipoPagamento.equals("2") && !tipoPagamento.equals("3") ){
            System.out.println("Por favor informe o método de pagamento!");
            System.out.println("1 - Cartão de Débito ,  2 - Para cartão de crédito ou 3 - Para Pix.");
            tipoPagamento = scanner.nextLine();
        }

        if (tipoPagamento.equals("1")) {

            Debito debito = new Debito();
            debito.recebeDados();

        }

        if (tipoPagamento.equals("2")) {

            Credito credito = new Credito();
            credito.recebeDados();

        }
        if (tipoPagamento.equals("3")) {

            Pix pix = new Pix();
            pix.recebeDados();

        }

    }

}
