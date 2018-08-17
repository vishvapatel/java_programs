import java.util.Scanner;
class Addition{ //defining the class addition where we write the proccess
    private double number1,number2,sum;
    public void input_data(double n1,double n2){ //method to get data
        this.number1=n1;
        this.number2=n2;
    }
    public void add_and_display(){ //method to add the number ad display at a time.
        this.sum=number1+number2;
        System.out.println("The sum of the two numbers is :"+sum);
    }
}
class Addition_by_classes_objects{ //Ahh the main class
    public static void main(String args[]){
        double num1,num2; //The two numbers that we are going to pass
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number :");
        num1=s.nextDouble();  //Taking the input number 1
        System.out.println("Enter the Second number:");
        num2=s.nextDouble(); //Taking the number 2
        Addition add=new Addition(); //creating object for Addition class
        add.input_data(num1,num2); //calling the input_data function
        add.add_and_display(); // ........Very IMPORTANT FUNCTION CALL :).................  calling the display function
    }
}