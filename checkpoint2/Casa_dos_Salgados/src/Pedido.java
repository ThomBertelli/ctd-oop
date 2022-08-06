
import java.util.Scanner;

public class Pedido {
    private Double valorTotal;
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void formarPedido (){

        boolean fecharPedido = false;
        int contadorCoxinha = 0;
        int contadorRisoles = 0;
        int contadorPerolaQueijo = 0;

        Scanner scanner= new Scanner(System.in);

        while(!fecharPedido){
            System.out.println("Por favor digite o código do produto que deseja ou 000 para fechar o pedido" + System.lineSeparator() +
                    "111 - COXINHA - R$ 2,50" + System.lineSeparator() +
                    "222 - RISOLES - R$ 2,00" + System.lineSeparator() +
                    "333 - PÉROLA DE QUEIJO - R$ 3,00");

            String escolhaDoCliente = scanner.nextLine();

            if(escolhaDoCliente.equals("111")){
                contadorCoxinha++;
                System.out.println("Coxinha adicionada ao carrinho!");
            }
            if(escolhaDoCliente.equals("222")){
                contadorRisoles++;
                System.out.println("Risoles adicionado ao carrinho!");
            }
            if(escolhaDoCliente.equals("333")){
                contadorPerolaQueijo++;
                System.out.println("Perola de Queijo adicionada ao carrinho!");
            }
            if(escolhaDoCliente.equals("000")){
                System.out.println(mostrarCarrinho(contadorCoxinha,contadorRisoles,contadorPerolaQueijo));
                fecharPedido = true;
            }


        }
    }

    public String mostrarCarrinho (int contadorCoxinha, int contadorRizoles, int contadorPerolaQueijo){

        Double valorTotalCozinhas = contadorCoxinha * 2.50;
        Double valorTotalRizoles = contadorRizoles * 2.00;
        Double valorTotalPerolaQueijo = contadorPerolaQueijo * 3.00;

        setValorTotal(valorTotalCozinhas + valorTotalRizoles + valorTotalPerolaQueijo);

        return  "----- CARINHO DE COMPRAS -----" + System.lineSeparator() +
                contadorCoxinha + " x Coxinhas = R$ " + valorTotalCozinhas + System.lineSeparator() +
                contadorRizoles + " x Rizoles = R$ " + valorTotalRizoles + System.lineSeparator() +
                contadorPerolaQueijo + " x Pérolas de Queijo = R$ " + valorTotalPerolaQueijo + System.lineSeparator() +
                "===>VALOR TOTAL = R$ " + getValorTotal();
    }




}
