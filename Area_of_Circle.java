import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args){
        Double radius;
        Scanner s=new Scanner(System.in);
        radius=s.nextDouble();         //taking input os radius of a circle.
        System.out.println("The area of the circle is" + compute_area(radius)); //Method call
    }

    public static double compute_area(double r){   //Method defination
         double pi=3.14,area;
        area=pi*r*r;
        return area;
    }
}
