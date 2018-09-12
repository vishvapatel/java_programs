
/*
* This is the math Package
* @author vishva patel
* Editor Intellij Idea
* Github vishvapatel/java_programs
*
*/
package math_Op; //Created package named math_Op.

public class Math {
   // we defined all the methods that performs various arithmetic operations These are invoked as they are called one at a time
   //with the help of switch statement int the Math_operations_using_package class.
    public void add(double num1 , double num2){
        double sum = 0.0;
        sum = num1 + num2;
        System.out.println("You Chose to Add :");
        System.out.println("The sum is :" + " " + sum);
    }
    public void subtract(double num1 , double num2){
        double diff = 0.0;
        diff = num1 - num2;
        System.out.println("You chose to Subtract :");
        System.out.println("This Difference is" + " " + diff );
    }
    public void multiply(double num1 , double num2){
        double product = 0.0;
        product = num1 * num2;
        System.out.println("You chose to multiply :");
        System.out.println("The product is :" + " " + product);
    }
    public void divide(double num1 , double num2){
        double quotient = 0.0;
        System.out.println("You chose to divide :");
        System.out.println("The division is" + " " + quotient);
    }
    public void modulo(double num1 , double num2){
        double modulous=0.0;
        System.out.println("You chose to find the remainder / modulous ");
        System.out.println("The modulus is" + " " + modulous);
    }

}
