/*
* This program is a demo of packages in java
* @author vishva Patel
* Editor Intellij Idea
* Github vishvapatel/Java_Programs
* */
package  Date;  //We created a package name Date Which is stored has to be stored as the subdirectory in the main folder where source files are written.
//In english package is nothing but a folder filled with various class files.

import java.util.Date; //Importing a package of java to access system date.
 //Created a class in the package NOTE: It should be declared pubic and the file should be stored same as the name of the public class name.
public class System_date {
    public void get_System_Date(){
        Date dt = new Date();  //Creating the obj for the java.util.Date class.
        System.out.println(dt); //Printing the object / system date
    }
}
