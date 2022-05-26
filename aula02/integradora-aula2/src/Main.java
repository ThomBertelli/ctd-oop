import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String nome;
        String sobrenome;
        char inicialDoNome;
        char inicialDoSobrenome;

        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        inicialDoNome = nome.charAt(0);

        System.out.println("Digite seu sobrenome");
        sobrenome = scanner.nextLine();
        inicialDoSobrenome = sobrenome.charAt(0);

        System.out.println("Suas iniciais são:" + inicialDoNome + inicialDoSobrenome);
        System.out.println("Seu nome completo é " + nome + " " + sobrenome);

        scanner.close();
    }
}