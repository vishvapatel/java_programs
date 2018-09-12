/* This is the demo of package to perform the arithmetic math operations (PS : IT'S A GAME)
* @author vishva patel
* Editor Intellij IDEA
* Github vishvapatel/java_programs
*/
import math_Op.Math; //Importing the user defind package math_op (math operations)
import java.util.Scanner;
public class Math_operations_using_package {
    public static void main(String args[]){
        boolean i=true; //This var will help us to go unlimited iterations;
        double num1 , num2;
        String choice,operation;  //choice : for continuation of operations and operation : for specifying ht arithmetic operation.
        Scanner sc = new Scanner(System.in);
        Math mop = new Math();
        System.out.println("Welcome to the game of Arithmetic operations with me :)"); //welcome statement
        System.out.println("GUIDELINES:\n" + "TYPE IN OPERATION WHEN ASKED :\n" + "add : FOR ADDITION\n" + "subtract : FOR SUBTRACTION\n" + "multiply : FOR MULTIPLICATION\n" + "divide : FOR DIVISION\n" + "modulo : FOR MODULUS");

        //starting of the algorithm PLEASE UNDERSTAND THE GUIDELINES CAREFULLY.
        do{
            System.out.println("DO YOU WANT TO CONTINUE : [true(YES) / false(NO)]");
            choice = sc.next(); //Asking for a choice for continuation.
            if(choice.equals("true")){
                System.out.println("Enter the First Number : "); //Taking the first number.
                num1 = sc.nextDouble();
                System.out.println("Enter the Second number"); //Taking the Second number
                num2 = sc.nextDouble();
                System.out.println("Enter the operation as per Guidelines:"); // Taking the operation to perform.
                operation = sc.next();
                switch (operation) {
                    case "add":
                        mop.add(num1, num2);  //Calling ADD method from the package math_op..............and likewise.
                        break;
                    case "subtract":
                        mop.subtract(num1, num2);
                        break;
                    case "multiply":
                        mop.multiply(num1, num2);
                        break;
                    case "divide":
                        mop.divide(num1, num2);
                        break;
                    case "modulo":
                        mop.modulo(num1, num2);
                        break;
                    default: System.out.println("Wrong Arithmetic operation or Spelling error :)");
                        break;
                }
            }
            else{
                System.out.println("Thank You! for playing , Have a nice Day :)");
                break;
            }

        }while(i); //This will take us until we want to.
    }
}
