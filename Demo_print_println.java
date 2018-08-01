import java.util.Scanner;
public class Demo_print_println {
    public static void main(String[] args) {
        String input_str;
        Scanner s = new Scanner(System.in);
        input_str = s.nextLine();
        System.out.print(input_str);    //demonstrating print() function i.e without moving to next line.
        System.out.println(input_str);  //using println() function to demonstrate the nextlinr by default action.
        System.out.print(input_str);
    }
}