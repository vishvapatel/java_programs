/* This program demonstrates the addition by method overloading 
// @author vishva patel
// Editor Sublime Text 3
// Github repo vishvapatel/java_programs
*/
import java.util.Scanner;
class addition{
 
	void do_addition(int num1, int num2){
		int add_result = num1 + num2;
		System.out.println("The addition of "+ num1 + " + " + num2 + " is " + add_result);
	}
	void do_addition(float num1 , float num2){
		float add_result = num1 + num2;
		System.out.println("The addition of "+ num1 + " + " + num2 + " is " + add_result);
	}
}
class Addition_using_method_overloading{
	public static void main(String args[]){
		int int_num1,int_num2;
		float float_num1,float_num2;
		Scanner sc =new Scanner(System.in);
		addition ad = new addition();
		System.out.println("Enter the first integer number:");
		int_num1 = sc.nextInt();
		System.out.println("Enter the Second integer number:");
		int_num2 = sc.nextInt();
		ad.do_addition(int_num1 , int_num2);
		System.out.println("Enter the first float number:");
		float_num1 = sc.nextFloat();
		System.out.println("Enter the Second flaot number:");
		float_num2 = sc.nextFloat();
		ad.do_addition(float_num1 , float_num2);
	}
}