import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

class Myframe extends JFrame implements ItemListener {
    
    JMenuBar menubar;
    JMenu mymenu;
    JCheckBoxMenuItem cItem;
    JTextArea ta;
	public Myframe() {
		Container c = getContentPane();
        c.setLayout(null);

        menubar = new JMenuBar();
        mymenu = new JMenu("File");
        cItem = new JCheckBoxMenuItem("Print");

        mymenu.add(cItem);
        menubar.add(mymenu);
        
        this.setJMenuBar(menubar);
        cItem.addItemListener(this);
        
        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
	}
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(cItem.isSelected()) {
            ta.setText("Print is on");
        }
        else {
            ta.setText("Print is off");
        }
    }
}




public class ItemEvent4 {

	public static void main(String[] args) {
		
		Myframe f = new Myframe();
		f.setTitle("Item Event1");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}


