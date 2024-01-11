import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;

public class Myframe extends JFrame implements MouseMotionListener { 
    
    JTextArea ta;
    JLabel label;
    public Myframe() {
       Container c = getContentPane();
       c.setLayout(null);
       label = new JLabel("My Label");
       label.setFont(new Font("arial", Font.BOLD,18));
       label.setBounds(50,100,100,30);
       c.add(label);

       label.addMouseMotionListener(this);

       ta = new JTextArea();
       ta.setBounds(200,50,300,330);
       c.add(ta);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText((ta.getText() + "\n" + "Mouse Dragged"));
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText((ta.getText() + "\n" + "Mouse Moved"));
    }
    
}

