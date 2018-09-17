/*
* This program is the demo of method overloading.
* we have calculated the area of shapes using the concept of method overloading
* @author vishva patel
* Editor Intellij Idea
* Github vishvapatel/java_programs
*/

import java.util.Scanner;  //importing the Scanner class to take user inputs
 class Shapes{
     private float area;  //declared the field private
     final static float pi = 3.14F; //defined the pi value as final and 3.14
     //The function shape_area is common to the area of circle as well as rectangle thus according to the parameter required and passed the
     // function call will be made
     public void shape_area(float length , float breadth){
       this.area=length*breadth;
       System.out.println("The shape is Rectangle");
       System.out.println("The area of rectangle is :"+ area+"\n--------------------");

     }
      public void shape_area(float radius){
         this.area=this.pi*radius*radius;
         System.out.println("The shape is circle");
         System.out.println("The area of the circle is :" + area+"\n----------------");
      }
 }
public class Area_of_shapes_method_overloading {
     public static void main(String args[]){
         float length,breadth,radius;
         Scanner sc = new Scanner(System.in);
         Shapes sh = new Shapes();
         System.out.println("Enter the length of Rectangle :");
         length=sc.nextFloat();
         System.out.println("Enter the breadth of rectangle :");
         breadth = sc.nextFloat();
         System.out.println("Enter the Radius of circle :");
         radius=sc.nextFloat();
         sh.shape_area(radius);
         sh.shape_area(length,breadth);
         sc.close();
     }
}
