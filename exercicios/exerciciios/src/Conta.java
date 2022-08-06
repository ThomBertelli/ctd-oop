public abstract class Conta {

    private Cliente cliente;

    private double saldo;

    

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    };


    public abstract void depositar(double valorDeposito);

    public abstract void sacar(double valorSaque);

    

}
