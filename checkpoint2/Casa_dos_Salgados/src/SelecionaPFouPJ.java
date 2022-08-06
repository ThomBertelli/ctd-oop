import java.util.Scanner;
public class SelecionaPFouPJ {

    public void selecionaPFouPJ(){

        Scanner scanner = new Scanner(System.in);

        String tipoCliente = "0";

        while(!tipoCliente.equals("1") && !tipoCliente.equals("2")){
            System.out.println("Por favor informe 1 - Para Pessoa Física ou 2 - Para pessoa jurídica");
            tipoCliente = scanner.nextLine();
        }

        if (tipoCliente.equals("1")) {
            PessoaFisisca cliente = new PessoaFisisca();
            cliente.fazerCadastro();
        }
        else{
            PessoaJuridica  cliente = new PessoaJuridica();
            cliente.fazerCadastro();
        }

    }

}
