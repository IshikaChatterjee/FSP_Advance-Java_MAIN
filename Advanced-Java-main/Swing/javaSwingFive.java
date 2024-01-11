//RadioButtons

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class javaSwingFive extends Component implements ActionListener {
    
    public JFrame jFrame;
    JRadioButton jRadioButtonOne, jRadioButtonTwo;

    public javaSwingFive() {
        jFrame = new JFrame("Example of RadioButtons");
        jFrame.setTitle("Swing");

        jRadioButtonOne = new JRadioButton("AWM");
        jRadioButtonOne.setBounds(100, 50, 100, 30);

        jRadioButtonTwo = new JRadioButton("AMR");
        jRadioButtonTwo.setBounds(100, 100, 100, 30);

        //Two selection - only one option
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonOne);
        bg.add(jRadioButtonTwo);

        JButton jButton = new JButton("Choose");
        jButton.setBounds(100, 150, 80, 30);

        jFrame.add(jButton);

        jButton.addActionListener(this);

        jFrame.add(jRadioButtonOne);
        jFrame.add(jRadioButtonTwo);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jRadioButtonOne.isSelected()) {
            JOptionPane.showMessageDialog(jFrame, "You will get 25 ammo");
        }else if(jRadioButtonTwo.isSelected()) {
            JOptionPane.showMessageDialog(jFrame, "You will get 10 ammo");
        }
    }

    public static void main(String[] args) {
        javaSwingFive j = new javaSwingFive();
    }
}
