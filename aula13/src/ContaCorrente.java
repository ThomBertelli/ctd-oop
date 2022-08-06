public class ContaCorrente extends Conta implements GravarImposto {

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    public void sacar(double valor){

    };

    public double imposto (double porc){

        return getSaldo() * (porc/100);

    };



}
