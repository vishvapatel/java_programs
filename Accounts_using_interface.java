/* This Program Demonstrates Accounts operations such as deposit and withdrawal using interface.
For more information abt the interface follow Addition_using_interface.java program.
*  @author Vishva Patel
*  Editor Intellij Idea
*  Github link vishvapatel/java_programs
*  */
import java.util.Scanner;
interface Acc_operations{   //interface Acc_operations
    public void deposit(double deposit_amount);  //Method Declarations for interface.
    public void withdraw(double withdraw_amount);//Method Declarations for interface.
}
class Current_account implements Acc_operations{    // Class Current Account contains the operations to be performed on the Current Account.
     private static double balance_amt; //static variable balance_amount to be shared by the methods of the classes.
      public void Current_account_initial_Amt( double initial_amt){
          this.balance_amt = initial_amt;
      }
    @Override
    public void deposit(double deposit_amount){
        this.balance_amt += deposit_amount;
    }

    @Override
    public void withdraw( double withdraw_amount) {
        if(balance_amt >= withdraw_amount) {
            this.balance_amt -= withdraw_amount;
        }
    }
    public void display_Current_Balance(){  //Method to display the balance and this method is not a interface method it is a class method.
          System.out.println("The balance in the current account is :" + " " + balance_amt );
    }
}
class Savings_account implements Acc_operations{  //This class performs all the operations on the savings account
    private static double balance_amt;
    public void Savings_account_initial_amt( double initial_amt){
        this.balance_amt = initial_amt;
    }
    @Override
    public void deposit(double deposit_amount){
        this.balance_amt += deposit_amount;
    }

    @Override
    public void withdraw( double withdraw_amount) {
        if(balance_amt >= withdraw_amount) {
            this.balance_amt -= withdraw_amount;
        }
    }
    public void display_Savings_Balance(){
        System.out.println("The balance in the Savings account is :" + " " + balance_amt );
    }
}
class Overdraft_account implements Acc_operations{  //This class performs the operations of the overdraft account.
    private static double balance_amt;
    public void Overdraft_account_initial_amt( double initial_amt){
        this.balance_amt = initial_amt;
    }
    @Override
    public void deposit(double deposit_amount){
        this.balance_amt += deposit_amount;
    }

    @Override
    public void withdraw( double withdraw_amount) {
        if(balance_amt >= withdraw_amount) {
            this.balance_amt -= withdraw_amount;
        }
    }
    public void display_Overdraft_Balance(){
        System.out.println("The balance in the current account is :" + " " + balance_amt );
    }
}
public class Accounts_using_interface {
    public static void main(String args[]) {
        double C_depo, C_withdraw, S_depo, s_withdraw, O_depo, O_withdraw, C_initial, s_initial, O_initial;
        Scanner sc = new Scanner(System.in);
        Current_account ca = new Current_account();
        Savings_account sa = new Savings_account();
        Overdraft_account oa = new Overdraft_account();
        Acc_operations Ac_op; //it is a interface datatype variable used in order to access the interface members.
        System.out.println("Enter the initial amt for current account");
        C_initial = sc.nextDouble();
        System.out.println("Enter the initial amt for Savings account");
        s_initial = sc.nextDouble();
        System.out.println("Enter the initial amt for Overdraft account");
        O_initial = sc.nextDouble();
        ca.Current_account_initial_Amt(C_initial);
        sa.Savings_account_initial_amt(s_initial);
        oa.Overdraft_account_initial_amt(O_initial);
        // ----------------------
        System.out.println("Enter the amount ot be deposited into Current account");
        Ac_op = ca; //Assigning the interface variable the to the current account object.
        C_depo = sc.nextDouble();
        Ac_op.deposit(C_depo); // using this assigning technique we can access the implemented methods of interface in the current account class.
        System.out.println("Enter the amount to be withdrawed from current account");
        C_withdraw = sc.nextDouble();
        Ac_op.withdraw(C_withdraw);
        // ----------------------
        System.out.println("Enter the amount to be deposited into Savings account");
        S_depo = sc.nextDouble();
        Ac_op = sa;
        Ac_op.deposit(S_depo);
        System.out.println("Enter the amount ot be Withdrawed from the savings account");
        s_withdraw = sc.nextDouble();
        Ac_op.withdraw(s_withdraw);
        // ----------------------------
        System.out.println("Enter the amount to be deposited into Overdraft account");
        O_depo = sc.nextDouble();
        Ac_op = oa;
        Ac_op.deposit(O_depo);
        System.out.println("Enter the amount ot be Withdrawed from the Overdraft account");
        O_withdraw = sc.nextDouble();
        Ac_op.withdraw(O_withdraw);
        ca.display_Current_Balance();   //Display the balance of the accounts.
        sa.display_Savings_Balance();
        oa.display_Overdraft_Balance();
        sc.close(); //Close the Scanner objects.
    }
}

