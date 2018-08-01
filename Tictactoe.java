import java.util.Scanner;
import java.util.Random;
public class Tictactoe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r= new Random();
        String playerone, choice;
         int  playertwo;
         System.out.println("HERE PLAYER TWO IS COMPUTER SO \n 0==SCISSORS \n 1==ROCK \n 2==PAPER \n FOR PLAYER TWO");
        do {
            System.out.println("do you want to continue?");
            choice = s.next();
            if (choice.equals("yes")) {
                System.out.print("Enter the object of player :");
                playerone = s.next();
                playertwo = r.nextInt(2);
                System.out.println("Computer Choice Is:" + playertwo);
                if ((playerone.equals("rock") && playertwo == (0)) || (playerone.equals("paper") && playertwo == (1)) || (playerone.equals("scissor") && playertwo == (2))) {
                    System.out.println("YOU WINS!!!!!");
                } else if ((playerone.equals("scissor") && playertwo == 0) || (playerone.equals("rock") && playertwo == 1) || (playerone.equals("paper") && playertwo == 2)) {
                    System.out.println("IT'S A TIE!!!!!");
                }
                else {
                    System.out.println("Computer WINS!!!!!");
                }

            }
            if(choice.equals("no")){
                break;
            }
            else{
                System.out.println("OOPS!! Wrong Choice Rerun The game again");
            }


        }while(choice.equals("yes"));
    }
}
