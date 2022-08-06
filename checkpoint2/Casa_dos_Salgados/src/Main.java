
//A proposta é um sistema de autoatendimento de um comércio especializado em salgados.
//O cliente faz um cadastro, escolhe os produtos que deseja e faz o pagamento.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Bem vindo a Casa dos Salgados!");
        System.out.println("Primeiramente temos que fazer o seu cadastro.");

        //Pergunta se é pessoa física ou jurídica e chama a classe PF ou PF de acordo com a resposta
        SelecionaPFouPJ pergunta = new SelecionaPFouPJ();
        pergunta.selecionaPFouPJ();

        //Pergunta quais produtos o cliente quer comprar.
        Pedido pedido = new Pedido();
        pedido.formarPedido();

        //Pergunta qual o método de pagamento.
        SelecionaTipoPagamento tipoPagamento = new SelecionaTipoPagamento();
        tipoPagamento.perguntaTipoPagamento();

    }
}