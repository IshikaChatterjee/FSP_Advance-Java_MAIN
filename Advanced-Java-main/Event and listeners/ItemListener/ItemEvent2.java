import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

class Myframe extends JFrame implements ItemListener{

    JRadioButton male,female;
    JTextArea ta;
	public Myframe() {
		Container c = getContentPane();
        c.setLayout(null);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(50,50,100,20);
        female.setBounds(50,100,100,20);
        c.add(male);
        c.add(female);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        male.addItemListener(this);
        female.addItemListener(this);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
	}
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == male ) {
            ta.setText("Male is clicked");
        }
        if (e.getSource() == female ) {
            ta.setText("female is clicked");
        }
    }
}




public class ItemEvent2 {

	public static void main(String[] args) {
		
		Myframe f = new Myframe();
		f.setTitle("Item Event1 Example");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}