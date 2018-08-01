import java.awt.FlowLayout;// layout of the window
import javax.swing.JFrame;//consistes of all the windows(OS) features
import javax.swing.JLabel;//Label to the item

public class window extends JFrame{

   private JLabel item;

   public window(){

       super("Demo of Window");
       setLayout(new FlowLayout());

       item=new JLabel("This is the text inside the window"); //this is the text which will appear as soon as the window is created.
       item.setToolTipText("This hapeens on hover"); //on hover effect basically.
       add(item);
   }
}
