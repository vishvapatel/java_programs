import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class jcheckbox extends JFrame {

    private JTextField textField;
    private JCheckBox bold;
    private JCheckBox italic;


    public jcheckbox(){

        super("Checkbox tutorial");
        setLayout(new FlowLayout());

        textField=new JTextField("This is a text field",30);
        textField.setFont(new Font("poppins",Font.PLAIN,20));
        add(textField);

        bold=new JCheckBox("This is a boldbox");
        italic=new JCheckBox("This is a itlaic check box");
        add(bold);
        add(italic);

        TheHandler handler =new TheHandler();
        bold.addItemListener(handler);
        italic.addItemListener(handler);
    }

    private class TheHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font=null;

            if(bold.isSelected() && italic.isSelected())
                font=new Font("poppins",Font.BOLD+Font.ITALIC,20);
            else if(bold.isSelected())
                font = new Font("poppins",Font.BOLD,20);
            else if(italic.isSelected())
                font = new Font("poppins",Font.ITALIC,20);
            else
                font = new Font("poppins",Font.PLAIN,20);

            textField.setFont(font);
        }


    }


}
