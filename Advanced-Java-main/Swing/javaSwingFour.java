//CheckBox

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class javaSwingFour implements ActionListener {
    
    public JFrame jFrame;
    JCheckBox checkBoxOne, checkBoxTwo, checkBoxThree;

    public javaSwingFour() {
        JLabel jLabel = new JLabel("Food billing");
        jLabel.setBounds(50, 50, 300, 20);

        checkBoxOne = new JCheckBox("Pizza 100");
        checkBoxOne.setBounds(100, 100, 150, 20);
        checkBoxTwo = new JCheckBox("Burger 70");
        checkBoxTwo.setBounds(100, 150, 150, 20);
        checkBoxThree = new JCheckBox("Coffee 50");
        checkBoxThree.setBounds(100, 200, 150, 20);

        JButton jButton = new JButton("total");
        // JButton jButton = new JButton("total", new ImageIcon("C:\\Users\\Soumodip Das\\Pictures\\images.jpg"));

        jButton.setBounds(100, 250, 80, 30);

        // Add the ActionListener to the button
        jButton.addActionListener(this);

        jFrame = new JFrame();
        
        jFrame.add(jButton);
        jFrame.add(checkBoxOne);
        jFrame.add(checkBoxTwo);
        jFrame.add(checkBoxThree);
        jFrame.add(jLabel);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Implement the actionPerformed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {

        float amount = 0;
        String message = "";

        if(checkBoxOne.isSelected()) {
           amount += 100;
           message += "Pizza 100\n";
        } 
        if(checkBoxTwo.isSelected()) {
           amount += 70;
           message += "Burger 70\n";
        } 
        if(checkBoxThree.isSelected()) {
           amount += 50;
           message += "Coffee 50\n";
        }

        message += "...........................\n";
        JOptionPane.showMessageDialog(jFrame, message+ " Total " +amount);
    }

    public static void main(String[] args) {
        javaSwingFour j = new javaSwingFour();
    }
}