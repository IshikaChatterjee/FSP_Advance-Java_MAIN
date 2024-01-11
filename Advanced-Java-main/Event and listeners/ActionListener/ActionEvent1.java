import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
	
	Container c;
	JButton button;
	public Myframe() {
		c = this.getContentPane();
        c.setLayout(null);
		button = new JButton("click Me");
        button.setBounds(100,100,100,30);
		c.add(button);

        button.addActionListener(this);
	}
    public void actionPerformed(ActionEvent e) {
        String str = button.getText();
        button.setText(str.toUpperCase());
    }
}

public class ActionEvent1 {

	public static void main(String[] args) {
		Myframe f = new Myframe();
		f.setTitle("Action Event");
		f.setBounds(100,100,400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}

}