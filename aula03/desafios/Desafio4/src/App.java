import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Inform how many hours Julieta worked this week:");
    int totalWeekHours = scanner.nextInt();
    
    double totalWeekPayment = 0;

    if(totalWeekHours > 40){
        int extraHours = totalWeekHours - 40;
        double extraPayment = extraHours * 32.81;

        totalWeekPayment = 875 + extraPayment;

    }else if(totalWeekHours == 40){
        totalWeekHours = 875;
    }
    
    
    System.out.println("Julieta's payment this week will be " + totalWeekPayment);

    }
}
