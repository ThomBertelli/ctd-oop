import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 2 ;

        if ((num1%num2 == 0)) {
            System.out.println(num1 +" é divisível por " + num2);
        }else{
            System.out.println(num1 +" não é divisível por " + num2);
        }
    //-------------------------------------------------//
        for(int i = 0; i < 5; i++){
            System.out.println("Olá!");}
//-------------------------------------------------------//
        String nome="Juan";
        int quantidade;
        char inicial;

        quantidade=nome.length();

        nome = nome.toUpperCase();

        if (nome.equals("JUAN")){
            System.out.println("Está em maiúscula");
        }
        inicial = nome.charAt(0);

        System.out.println(quantidade);

        System.out.println(inicial);
//-----------------------------------------------------------------/

    Integer valor1 = 10;

    Integer valor2 = 20;

    int comparar;

    if (valor1.equals(valor2)){
        System.out.println("São Iguais");
    }else {
        comparar = valor1.compareTo(valor2);
        if (comparar > 0) {
            System.out.println("valor1 é maior que valor2");
        } else {
            System.out.println("valor2 é maior que valor1");
        }
    }
    //----------------------------------------------------------------//

        Scanner scanner;
    scanner = new Scanner(System.in);

    int number1;
    int number2;
    float coeficient;

    System.out.println("Insira o primeiro número");
    number1 = scanner.nextInt();
    System.out.println("Insira o segundo número");
    number2 = scanner.nextInt();

    System.out.println("Insira o coeficiente");
    coeficient = scanner.nextFloat();


    }
}