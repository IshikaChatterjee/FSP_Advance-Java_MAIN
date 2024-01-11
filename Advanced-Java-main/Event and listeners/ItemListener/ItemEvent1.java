import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class Myframe extends JFrame implements ItemListener{

    JComboBox combo;
    JTextArea ta;
	public Myframe() {
		Container c = getContentPane();
        c.setLayout(null);

        String[] values = {"A","B","C","D"};
        combo = new JComboBox(values);
        combo.setBounds(50,50,100,30);
        c.add(combo);

        combo.addItemListener(this);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
	}
    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = combo.getSelectedItem().toString();
        ta.setText(str);
    }
}




public class ItemEvent1 {

	public static void main(String[] args) {
		
		Myframe f = new Myframe();
		f.setTitle("Item Event1 Example");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}