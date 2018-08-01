import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JButon extends JFrame {

    private JButton regular ;
    private JButton custom;

    public JButon(){

        super("The Button");
        setLayout(new FlowLayout());

        regular = new JButton("Regular button");
        add(regular);

        Icon lion = new ImageIcon(getClass().getResource("Lion.jpg"));
        Icon zebra = new ImageIcon(getClass().getResource("Zebra.jpg"));

        custom = new JButton("Custom button",lion);
        custom.setRolloverIcon(zebra);
        add(custom);

        TheHandler handler = new TheHandler();
        regular.addActionListener(handler);
        custom.addActionListener(handler);

    }

    private class TheHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
    }

    }
}
