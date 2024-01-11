import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;

public class Myframe extends JFrame implements KeyListener {

    JTextArea ta;
    public Myframe() {
       Container c = getContentPane();
       c.setLayout(null);

       ta = new JTextArea();
       ta.setBounds(10,10,370,330);
       c.add(ta);
       ta.addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText() +"\n"+ "Key is Typed : " + e.getKeyChar());
    }
    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText() +"\n"+ "Key is Pressed : " + e.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText() +"\n"+ "Key is Released : " + e.getKeyChar());
    }
}



