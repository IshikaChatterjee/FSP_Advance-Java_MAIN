//JButtob, JLabel, JTextField

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class javaSwingTwo {

    public javaSwingTwo() {
        JFrame jFrame = new JFrame();

        //JButton
        JButton jButton = new JButton("Submit");
        jButton.setBounds(100, 40, 100, 30);
        jFrame.add(jButton);

        //JLabel
        JLabel jLabel = new JLabel("JLabel");
        jLabel.setBounds(100, 90, 250, 30);
        jFrame.add(jLabel);

        //JTextField
        JTextField jTextField = new JTextField();
        jTextField.setBounds(100, 150, 250,30);
        jFrame.add(jTextField);

        jFrame.setTitle("The first program of jFrame");
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        javaSwingTwo j = new javaSwingTwo();
    }
}
