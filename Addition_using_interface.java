/*THis Program Demonstrates the Use of interface
* Interface in java is used to implement multiple inheritance
* We use interface because java cannot extend more than one class.
* Editor Intellij Idea
* @author Vishva Patel
* Github Link vishvapatel/java_programs
*/
import java.util.Scanner;

interface addition{   //Declaring and defining the interface
  public int add(int num1 , int num2); //In interface everything is final(by default) and can only be declared not defined.
}
class calc implements addition{  //TO use any interface we write implements Keyword in order to implement the interface.

    @Override  //AS everything is final in interface we need to override the methods to access them.
    public int add(int n1 , int n2){  //Defining the method  add declared in interface
        int  sum =0;
        sum=n1+n2;
        return sum;
    }
}
public class Addition_using_interface {
    public static void main(String args[]){
        int num1,num2;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the  first number :");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number :");
        num2 = sc.nextInt();
        addition ad = new calc();  //to access the interface methods we need to create the vsriable of interface datatype and store the object of the implementing class
        //and access the interface variables and methods.
        System.out.println("The sum is " + " " + ad.add(num1,num2)); // calling and printing thr output.
        sc.close();
    }
}
