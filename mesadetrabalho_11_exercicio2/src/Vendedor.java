public class Vendedor extends Funcionario {

    public Vendedor(String nome, String sobrenome, String cpf, String email, String matricula) {
        super(nome, sobrenome, cpf, email, matricula);
    }

    public void pagamento(){

    }

    @Override
    public String toString() {
        return  getNome();
    }
}
