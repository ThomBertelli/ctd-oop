public class ContaPoupanca extends Conta {

    private float taxaJuros;

    public ContaPoupanca(Cliente cliente, double saldo, float taxaJuros) {
        super(cliente, saldo);
        this.taxaJuros = taxaJuros;
    }

    
    public void depositar(double valorDeposito) {
        this.setSaldo(this.getSaldo() + valorDeposito);
    }

    public void sacar(double valorSaque) {
        if (this.getSaldo() < valorSaque ){
            System.out.println("Saldo Insuficiente");
        }else{
            this.setSaldo(this.getSaldo() - valorSaque);

        }
        
    }

    public void cobrarJuros(){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.taxaJuros));
    }


    @Override
    public String toString() {
        return "Nome cliente:" + getCliente().getNome() + System.lineSeparator() + "Saldo:" + getSaldo() + System.lineSeparator() ;
    }

}
