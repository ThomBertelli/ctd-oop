import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println(calculatePrimeNumbers());

    }
    public static String calculatePrimeNumbers() {
        System.out.println("---- CHALLENGE 01 - CALCULATE PRIME NUMBERS -----");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number:");
        int number = scanner.nextInt();

        int index = 0;
        int currentNumber = 2;

        String result = "The " + number + " first number are: ";

        while (index < number) {
            if (isPrimeNumber(currentNumber)) {
//                System.out.println("Number " + currentNumber + " is a prime number.");
                result += currentNumber + ", ";
                index++;
            };
            currentNumber++;
        }

        return result;
    }

    public static boolean isPrimeNumber(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0)
                return false;
        }
        return true;
    }
}
