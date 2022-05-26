import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Qual o nome do cachorro ?");
        String dogName = scanner.next();

        System.out.println("Informe ,em kilos, quanta racao o cachorro come.");
        float dogFoodQtd = scanner.nextFloat();
        
        while(dogFoodQtd < 3){
            System.out.println("A quantidade de comida nao pode ser inferior a 3 kilos por dia");
            System.out.println("Informe ,em kilos, quanta racao o cachorro come.");
            dogFoodQtd = scanner.nextFloat();
        };

        quantosPacotes(dogName, dogFoodQtd);
    }

    public static void quantosPacotes (String dogName, float dogFoodQtd){
        
        System.out.println(dogName + " come " + dogFoodQtd + " kilos de racao diariamente.");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        
        float totalDogFoodWeight = 0;
        int dogFoodPackegeCounter = 0;

        while(totalDogFoodWeight < dogFoodQtd){
            System.out.println("Qual o peso do pacote de comida de cachorro ?");
            float dogFoodPackageWeight = scanner.nextFloat();
            totalDogFoodWeight = totalDogFoodWeight + dogFoodPackageWeight;
            dogFoodPackegeCounter++;
        };
        
        System.out.println(dogName + " precisa de " + dogFoodPackegeCounter + " pacotes de racao.");
    } 
    
}
