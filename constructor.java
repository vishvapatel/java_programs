//Program for constructor overloading
//@author vishva patel
//import java.util.Scanner;
class overload{ //creating class overload
		double length,breadth;
		overload(double l,double b){  //defined constructor for area of rectangle
            double area;
            this.length=l;
            this.breadth=b;
            area=l*b;
            System.out.println("the area of rectangle is:"+ area);
		}
		overload(double l){ //definiing for the area of square
			double area;
			this.length=l;
			area=l*l;
            System.out.println("The area of square is:"+area);
		}
}
class constructor{ //the main class constructor
     public static void main(String args[]){
     	overload o=new overload(10,45);//creating and initializing object 'o' and it will call the rectangle constructor as two params are passed.
     }
}