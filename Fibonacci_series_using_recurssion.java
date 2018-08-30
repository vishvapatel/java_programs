/* This Program Demonstrates the fibonacci series upto the upperbound number given by the user using recurssion
// @author Vishva patel
// Editor Sublime text 3
//  Github repo vishvapatel/java_programs*/
import java.util.Scanner;
class fibonacci{
	//defining the fibonacci function
	int fibo(int number){
		if (number == 0)
			return 0;
		else if (number == 1)
			return 1;
		else 
			return ( fibo(number - 1) + fibo(number - 2) );
	}
}
class Fibonacci_series_using_recurssion{
	public static void main(String args[]){
		int upper_bound,result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the upper_bound number :");
		upper_bound = s.nextInt(); //taking the number from the user
		fibonacci fb = new fibonacci(); //creating the object for class fibonacci
		result=fb.fibo(0); //calling the fibo() function of the class fibonacci
		int i=1;
		//this loop will run until the result is less than or equal upperbound.  
		while(result <= upper_bound){
			System.out.println(result);
			result = fb.fibo(i);
			i++;
		} 
 
	}
}