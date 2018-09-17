import java.util.Scanner;
class Rectangle{
    protected double length,breadth,area,perimeter;
    public void rect_area_perimeter(double l , double b){
        this.length=l;
        this.breadth=b;
        this.area=length*breadth;
        this.perimeter=2*(length+breadth);
        System.out.println("The area of rectangle is :" + area);
        System.out.println("The perimeter of rectangle is :" + perimeter);
    }
}
class Round_rectangle extends Rectangle{
    private double corner_radius , corner_circumference;
    private final double pi = 3.1415;
    public void round_RectAP(double corner_rad){
       this.corner_radius = corner_rad;
       this.corner_circumference = corner_radius*corner_radius*(4 - pi);
       area = length*breadth - corner_circumference;
       perimeter = 2*(length + breadth - corner_radius*(4 -pi));
       System.out.println("The area of round rectangle is :" + this.area);
       System.out.println("The perimeter of round  rectangle is :" + this.perimeter);
    }
}
public class Area_Perimeter_using_inheritance {
    public static void main(String args[]) {
        double length, breadth, corner_radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        length = sc.nextDouble();
        System.out.println("Enter the breadth/width of the rectangle:");
        breadth = sc.nextDouble();
        System.out.println("Enter the Corner Radius for round rectangle:");
        corner_radius = sc.nextDouble();
        Round_rectangle rr = new Round_rectangle();
        rr.rect_area_perimeter(length , breadth);
        rr.round_RectAP(corner_radius);
        System.gc();
        sc.close();
    }
}
