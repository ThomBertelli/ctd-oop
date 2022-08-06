public class Gerente extends Funcionario {

    public Gerente(String nome, String sobrenome, String cpf, String email, String matricula) {
        super(nome, sobrenome, cpf, email, matricula);
    }

    public void pagamento(){

    }

    @Override
    public String toString() {
        return getNome();
    }
}
