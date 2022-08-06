import java.util.ArrayList;
import java.util.Scanner;

public class Pix {
    
    private String chavePix;

    private String nomeBanco;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    //Simula o envio das informações do meio de pagamento para uma instituição financeira.
    public String receberDinheiro() {

        ArrayList dadosPagamento = new ArrayList();

        dadosPagamento.add(getChavePix());
        dadosPagamento.add(getNomeBanco());


        if (!dadosPagamento.get(0).equals("") &&
            !dadosPagamento.get(1).equals("")) {
            return "ok!";
        }
        else{
            return "Error ao processar pagamento";
        }

    }
    public void recebeDados(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---PIX---");

        System.out.println("Chave Pix:");
        setChavePix(scanner.nextLine());

        System.out.println("Nome do Banco:");
        setNomeBanco(scanner.nextLine());

        if (this.receberDinheiro().equals("ok!")) {
            System.out.println("Compra realizada com sucesso! Muito obrigado!");
            System.out.println("Agora é só aguardar o atendente chamar a sua senha!");
        }else{
            System.out.println("Infelizmente não foi possível realizar o pagamento.");
            recebeDados();
        }

    }

}
