import java.util.Scanner;
public class Resultcalculator {
    public static void main(String [] args){
        System.out.println("The marks are out of 50 for subjects and for sports it is out of  20 ");
        getMarks();
    }
    public static void getMarks(){
         float sub1,sub2,sports,sub3;
        Scanner subject=new Scanner(System.in);
        System.out.println("Enter the marks of subject 1");
        sub1=subject.nextFloat();
        System.out.println("Enter the marks of subject 2");
        sub2=subject.nextFloat();
        System.out.println("Enter the marks of sports");
        sports=subject.nextFloat();
        System.out.println("Enter the marks of third subject");
        sub3=subject.nextFloat();
        calculate(sub1,sub2,sports,sub3);
    }
    public static void calculate(float sub1, float sub2, float sports,float sub3){
        float total;
        total=sub1+sub2+sports+sub3;
        if(total>=110 && total<=170){
            System.out.println("pass with first class");
        }
        else if (total>=100 && total<110){
            System.out.println("passed with distinction");
        }
        else if(total>=50 && total<100){
            System.out.println("pass");
        }
        else
        {
            System.out.println("FAIlED TRY AGAIN");
        }
    }

}
