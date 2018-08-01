import java.util.*;
public class oddsorevens {

    public static void main(String [] args){
        int i,player,comp,total;
        String choice;
        Scanner s=new Scanner(System.in);
     System.out.println("Let's play odd even's game");
        System.out.println("Player have to choose even or odd : choose one");
        choice=s.next();
            for(i=1;i<3;i++){
                System.out.println("Enter the number of the player");
                player=s.nextInt();
                Random rand=new Random();
                comp=rand.nextInt(6);
                System.out.println("The computr number is"+comp);
                total=player+comp;
                if((choice.equals("odd") && (total%2!=0))||(choice.equals("even")&&(total%2==0))){
                    System.out.println("player wins !!");
                }
                else{
                    System.out.println("computer wins!!");
                }



        }
    }
}
