import java.util.Scanner;
class Vehicle
{
    protected int max_speed ;
    protected String Fuel_used , Color ;
    void get_Data(int spd , String fuel , String color ){
        this.max_speed = spd;
        this.Fuel_used = fuel;
        this.Color = color;
    }
}
class Evaluate_vehicle extends Vehicle{
    public void evaluate_vehicle(){
        if(max_speed < 120 && Fuel_used.equals("petrol") ){
            System.out.println("The Vehicle is a two wheeler of color" + Color);
        }
        else if(Fuel_used.equals("NULL")){
            System.out.println("The Vehicle is a bicycle of color" + Color );
        }
    }
}
class Car extends Evaluate_vehicle{
    public void ca(){
        if (max_speed >= 120){
            if(Fuel_used.equals("petrol") || Fuel_used.equals("diesel")) {
                System.out.println("This is a car of color" + Color);
            }
        }
    }
}
public class Features_of_vehicles_inheritance{
    public static void main(String args[]){
        int max_speed;
        String color  , fuel_type ;
        Scanner sc = new Scanner(System.in);
        Evaluate_vehicle vh = new Evaluate_vehicle();
        Car cr = new Car();
        System.out.println("Enter the max_speed of the vehicle");
        max_speed = sc.nextInt();
        System.out.println("Enter the fuel_type of the vehicle (ALL IN SMALL CAPS)");
        fuel_type = sc.next();
        System.out.println("Enter the color of the vehicle");
        color = sc.next();
        vh.get_Data(max_speed ,fuel_type , color );
        vh.evaluate_vehicle();
        cr.ca();
        sc.close();
    }
}

