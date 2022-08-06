public abstract class  Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor){

    };
    public abstract void sacar (double valor);

    public double informarSaldo(){
        return this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
