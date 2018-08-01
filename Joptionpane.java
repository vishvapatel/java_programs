
import javax.swing.JOptionPane;//importing the option pane class builtin class in java.

//Creating a program to add two numbers using the joptionpane.

public class Joptionpane {
    public static void main(String [] args){

        String first=JOptionPane.showInputDialog("Enter the first number");/*This is an input dialog for entering the first number.
                                                                               showinputdialog takes only the string imput */
        String second= JOptionPane.showInputDialog("Enter the second number");

        int number1=Integer.parseInt(first); //this will covert the string input into integer for math operations
        int number2=Integer.parseInt(second);

        int sum=number1+number2;//performing the addition and storing the output in the sum variable
        JOptionPane.showMessageDialog(null,"The answer is" + sum,"sum",JOptionPane.PLAIN_MESSAGE);

    }
}
