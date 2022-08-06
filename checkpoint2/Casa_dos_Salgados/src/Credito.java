import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Credito implements Pagamento {

    private String nomeCliente;

    private String numeroCartao;

    private String dataVencimentoCartao;

    private int codigoSegurancaCartao;

    private int numParcelas;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDataVencimentoCartao() {
        return dataVencimentoCartao;
    }

    public void setDataVencimentoCartao(String dataVencimentoCartao) {
        this.dataVencimentoCartao = dataVencimentoCartao;
    }

    public int getCodigoSegurancaCartao() {
        return codigoSegurancaCartao;
    }

    public void setCodigoSegurancaCartao(int codigoSegurancaCartao) {
        this.codigoSegurancaCartao = codigoSegurancaCartao;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    //Simula o envio das informações do meio de pagamento para instituição financeira.
    public String receberDinheiro() {

        ArrayList dadosPagamento = new ArrayList();

        dadosPagamento.add(getNumeroCartao());
        dadosPagamento.add(getNomeCliente());
        dadosPagamento.add(getCodigoSegurancaCartao());
        dadosPagamento.add(getDataVencimentoCartao());
        dadosPagamento.add(getNumParcelas());

        if (!dadosPagamento.get(0).equals("") &&
            !dadosPagamento.get(1).equals("") &&
            !dadosPagamento.get(2).equals("") &&
            !dadosPagamento.get(3).equals("") &&
            !dadosPagamento.get(4).equals("")) {
            return "ok!";
        } else {
            return "Error ao processar pagamento";
        }
    }

    public void recebeDados() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---CRÉDITO---");

        System.out.println("Numero do Cartão:");
        setNumeroCartao(scanner.nextLine());

        System.out.println("Nome completo (como está escrito no cartão):");
        setNomeCliente(scanner.nextLine());

        System.out.println("Data de Vencimento do Cartão:");
        setDataVencimentoCartao(scanner.nextLine());

        try {
            System.out.println("Número de Parcelas (somente números)");
            setNumParcelas(scanner.nextInt());
        } catch (InputMismatchException exception) {
            System.err.println("Favor informar somente números");
            recebeDados();
        }

        try {
            System.out.println("Código de Segurança (somente números):");
            setCodigoSegurancaCartao(scanner.nextInt());
            if (this.receberDinheiro().equals("ok!")) {
                System.out.println("Compra realizada com sucesso! Muito obrigado!");
                System.out.println("Agora é só aguardar o atendente chamar a sua senha!");
                System.exit(0);
            } else {
                System.out.println("Infelizmente não foi possível realizar o pagamento.");
                recebeDados();
            }
        } catch (InputMismatchException exception) {
            System.err.println("Favor informar somente números");
            recebeDados();
        }

    }

}
