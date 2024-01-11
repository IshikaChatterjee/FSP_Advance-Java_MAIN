//WindowListener & addActionListener

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class javaSwingThree {

    public javaSwingThree() {
        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("Submit");
        jButton.setBounds(100, 40, 100, 30);

        JLabel jLabel = new JLabel("JLabel");
        jLabel.setBounds(100, 90, 250, 30);
        
        JTextField jTextField = new JTextField();
        jTextField.setBounds(100, 150, 250,30);

        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jTextField);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Hello Mario");
                jTextField.setText("Hey Mario, this is a example of jTextField");
            }
        });
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        javaSwingThree j = new javaSwingThree();
    }
}
