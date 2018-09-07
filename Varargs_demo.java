/* This Program gives a demo of how to use var_args in java
* @Author Vishva Patel
* Github repo vishvapatel/java_programs
*/
public class Varargs_demo {
    public static void main(String args[]){
        String person; //declaring a variable which will have a multiple values
        varargs("Hardik" ,"Ravi" ,"Mohit" , "Ruchit");   //Calling the varargs function by passing the multiple values of person.
    }
    public static void varargs(String ... person){    //defining the function  HERE THE STRING PERSON CAN HAVE MANY ARGUMENTS FOR PERSON .
        for(String name : person){ //ENHANCED FOR LOOP WILL RUN UNTIL THE VALUES OF A PERSON
            System.out.println("Name:"+name+"\n"); //PRINTING THE OUTPUT
        }//... is known as ellipsis
    }
}
