import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class Myframe extends JFrame implements CaretListener {

    JTextField t1;
    JTextArea ta;
    public Myframe() {
       Container c = getContentPane();
       c.setLayout(null);

       t1 = new JTextField();
       t1.setFont(new Font("arial", Font.BOLD,18));
       t1.setBounds(50,100,100,30);
       c.add(t1);
       t1.addCaretListener((CaretListener) this);

       ta = new JTextArea();
       ta.setBounds(200,50,300,330);
       c.add(ta);
    }
    @Override
    public void caretUpdate(CaretEvent e) {
        ta.setText(ta.getText() + "\n" + "Caret Updated : " +e.getDot() + " : " + e.getMark());
    }
    
}
