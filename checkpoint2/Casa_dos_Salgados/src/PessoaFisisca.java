import java.util.Scanner;

public class PessoaFisisca extends Cliente {

    private String cpf;
    void fazerCadastro() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Por favor digite seu nome completo:");
        setNome(scanner.nextLine());

        System.out.println("Por favor digite seu endereço completo:");
        setEndereco(scanner.nextLine());

        System.out.println("Por favor digite seu CPF:");
        this.cpf = (scanner.nextLine());

    }

    @Override
    public String toString() {
        return getNome() + System.lineSeparator() + getEndereco() + System.lineSeparator() + cpf ;
    }
}


