import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

class Myframe extends JFrame implements ItemListener {
    
    JCheckBox c1,c2,c3,c4;
    JTextArea ta;
	public Myframe() {
		Container c = getContentPane();
        c.setLayout(null);

        c1 = new JCheckBox("10th");
        c2 = new JCheckBox("12th");
        c3 = new JCheckBox("Graduate");
        c4 = new JCheckBox("Post-Graduate");

        c1.setBounds(50,50,100,30);
        c2.setBounds(50,100,100,30);
        c3.setBounds(50,150,100,30);
        c4.setBounds(50,200,100,30);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        
        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
	}
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (c1.isSelected()) {
            ta.setText("10th");
        }
        if (c2.isSelected()) {
            ta.setText(ta.getText() + "\n" + "12th");
        }
        if (c3.isSelected()) {
            ta.setText(ta.getText() + "\n" + "Graduate");
        }
        if (c4.isSelected()) {
            ta.setText(ta.getText() + "\n" + "Post-Graduate");
        }
    }
}




public class ItemEvent3 {

	public static void main(String[] args) {
		
		Myframe f = new Myframe();
		f.setTitle("Item Event1");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

