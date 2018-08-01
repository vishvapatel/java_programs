/*This is a program to count the occurences of the character  in a string*/
import java.util.Scanner; //importing Scanner so as to take input.
public class find_the_char {
      public static void main(String[] args){
          //------------declaring variables------------------------
          String str;
          String c;
          int index,count=0,len;
          //------initializing scanner class-------
          Scanner s=new Scanner(System.in);
          str=s.nextLine();
          c=s.next();
          //-----spliting string so as to store it in a array so that we can traverse to find the occurences.
          String splt_str[]=str.split("");
          len=str.length();
          //------searching loop-------
          for (index=0;index<len;index++){
              //-----checking if match found---------------
              if(splt_str[index].equals(c)){
                  count++; //---if match found increment the count--
              }
          }
          System.out.println(count); //===print the count of occurences.---
      }
}
