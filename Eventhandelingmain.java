import javax.swing.JFrame;
public class Eventhandelingmain {
    public static void main(String [] args){

        Eventhandeling eventhandler=new Eventhandeling();//creating the object of the eventhandeling class.
        eventhandler.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exiting the window successfully.
        eventhandler.setSize(600,400);//setting size
        eventhandler.setVisible(true);//giving visibility

    }
}
