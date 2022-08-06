public class Cliente {
        private String nome;
        private String sobrenome;
        private String rg;
        private double saldoEmConta;
        private double limite;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }



    public Cliente(String nome, String sobrenome, String rg, double limite) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.rg = rg;
            this.limite= limite;
            saldoEmConta=0;

        }


        public void comprar(double valor) throws ContaException {

            if (getSaldoEmConta() <= 0 && getLimite() + ( getSaldoEmConta() - valor) < 0) {
                throw new ContaException("Saldo/Limite indisponível para compra.");
            }
            this.saldoEmConta-=valor;


        }

        public void pagarDivida(double valor) throws ContaException{
            if ( getSaldoEmConta() >= 0){
                throw new ContaException("Não há dívidas para quitar.");
            }
            saldoEmConta+=valor;

        }

        @Override
        public String toString() {
            return "Cliente{" +
                    nome + ' ' +
                    sobrenome + ' ' +
                    ", seu saldo é R$ " + saldoEmConta + "}";
        }

}
