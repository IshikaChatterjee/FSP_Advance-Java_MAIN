import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.FocusEvent;

public class Myframe extends JFrame implements FocusListener {

    JTextField t1;
    JTextArea ta;
    public Myframe() {
       Container c = getContentPane();
       c.setLayout(null);

       t1 = new JTextField();
       t1.setFont(new Font("arial", Font.BOLD,18));
       t1.setBounds(50,100,100,30);
       c.add(t1);
       t1.addFocusListener(this);

       ta = new JTextArea();
       ta.setBounds(200,50,300,330);
       c.add(ta);
    }
    @Override
    public void focusGained(FocusEvent e) {
        ta.setText(ta.getText()+ "\n" + "Textbox Focus gained");
    }
    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText()+ "\n" + "Textbox Focus lost");
    }
    
}
