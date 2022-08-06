import java.time.LocalDate;
public class Fatura {

    private Cliente cliente;

    private Plano plano;

    private LocalDate vencimento;

    public String geraFatura (String nomeCliente, String nomePlano, double valorPlano, LocalDate vencimento){


        return "Prezado(a) "+ nomeCliente + "! O valor da sua fatura é " + valorPlano + " reais, referente ao plano " + nomePlano + "," +
                " com vencimento em " + vencimento;

    }
}
