import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;

public class Myframe extends JFrame implements MouseListener {

    JLabel label;
    JTextArea ta;
    public Myframe() {
       Container c = getContentPane();
       c.setLayout(null);

       label = new JLabel("My Label");
       label.setFont(new Font("arial", Font.BOLD,18));
       label.setBounds(50,100,100,30);
       c.add(label);
       label.addMouseListener(this);

       ta = new JTextArea();
       ta.setBounds(200,50,300,330);
       c.add(ta);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse is Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse is Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse is Released");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse is Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText() + "\n" + "Mouse is Exited");
    }
    
}
