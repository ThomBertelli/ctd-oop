import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player one name:");
        String player1Name = scanner.nextLine();

        System.out.println("Player two name:");
        String player2Name = scanner.nextLine();

        int player1WinsCounter = 0;
        int player2WinsCounter = 0;

        String player1Choice = "";
        String player2Choice = "";

        while(!player1Choice.equals("*") && !player2Choice.equals("*") ){
        
        System.out.println("- " + player1Name + " type rock, paper or scissors. If you want to leave the game, type *.");
        player1Choice = scanner.nextLine();
    
        System.out.println("- " + player2Name + " type rock, paper or scissors. If you want to leave the game, type *.");
        player2Choice = scanner.nextLine();
        
        if(whichWin(player1Choice, player2Choice) == 1){
            player1WinsCounter = player1WinsCounter + 1;
        }else if(whichWin(player1Choice, player2Choice) == 2){
            player2WinsCounter = player2WinsCounter + 1;
        }
        
        }

        System.out.println( showRoundWinner(player1WinsCounter, player2WinsCounter));
    }

    public static int whichWin (String player1Choice, String player2Choice){
        int result = 0;
        
            switch(player1Choice){
            case "rock":
                switch(player2Choice){
                    case "rock":
                    result = 0;
                    break;
                    case "paper":
                    result = 2;
                    break;
                    case "scissors":
                    result = 1;
                    break;
                    
                };
                break;
            case "paper":
                switch(player2Choice){
                    case "rock":
                    result = 1;
                    break;
                    case "paper":
                    result = 0;
                    break;
                    case "scissors":
                    result = 2;
                    break;                    
                };
                break;
            case "scissors":
                switch(player2Choice){
                    case "rock":
                    result = 2;
                    break;
                    case "paper":
                    result = 1;
                    break;
                    case "scissors":
                    result = 0;
                    break;
                };
            break;
        
        }        
        return result;
    }

    public static String showRoundWinner (int player1WinsCounter, int player2WinsCounter){
        if (player1WinsCounter > player2WinsCounter){
            return "Congratulation Player 1! You won the round! The scoreboard was " + player1WinsCounter + " to " + player2WinsCounter;
        }else if(player1WinsCounter < player2WinsCounter){
            return "Congratulation Player 2! You won the round! The scoreboard was " + player2WinsCounter + " to " + player1WinsCounter;
        }
        
        return "Tie!!";
        
    }
}
