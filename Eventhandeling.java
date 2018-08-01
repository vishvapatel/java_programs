/*Creating a program to demonstrate a action event listener or event handeling in java */

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Eventhandeling extends JFrame{//This linr creates the blank window.

    private JTextField item1;//declaring the fields
    private JTextField item2;
    private JTextField item3;
    private JPasswordField item4;

    public Eventhandeling(){
        super("Event Handeling Window");//title of the window
        setLayout(new FlowLayout());//setting up the layout.

        item1 = new JTextField("Enter your name",10);
        add(item1);

        item2 = new JTextField("Username");
        add(item2);

        item3 = new JTextField("Enter atleast 6 characters password",50);
        item3.setEditable(false);
        add(item3);

        item4 = new JPasswordField("Enter password");
        add(item4);

        thehandler handler=new thehandler(); //creating an object to the class thehandler which will manage the action events.

        item1.addActionListener(handler);//addActionListener take only the object of the listener class.
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
    }

    private class thehandler implements ActionListener{ //There i sa compulsion to create a action listener class that implements ActionListener.

        public void actionPerformed(ActionEvent event){ //actionperformed method is an abstract method by default you cannot change the name of the method.

            String str="";

            if(event.getSource()==item1)
                str=String.format("Your name is: %s",event.getActionCommand());
            else if (event.getSource()==item2)
                str=String.format("Your username is: %s",event.getActionCommand());
            else if (event.getSource()==item3)
                str=String.format("This is an instruction : %s",event.getActionCommand());
            else if (event.getSource()==item4)
                str=String.format("Your Password is : %s",event.getActionCommand());

            JOptionPane.showMessageDialog(null,str);
        }
    }

}
