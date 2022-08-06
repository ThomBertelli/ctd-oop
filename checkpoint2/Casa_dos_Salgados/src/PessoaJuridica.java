import java.util.Scanner;

public class PessoaJuridica extends Cliente {

    private String cnpj;
    void fazerCadastro() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Por favor digite nome da empresa:");
        setNome(scanner.nextLine());

        System.out.println("Por favor digite o endereco da empresa:");
        setEndereco(scanner.nextLine());

        System.out.println("Por favor digite seu CNPJ:");
        this.cnpj = (scanner.nextLine());

    }

    @Override
    public String toString() {
        return getNome() + System.lineSeparator() + getEndereco() + System.lineSeparator() + cnpj ;
    }
}
