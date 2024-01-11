//ComboBox

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class javaSwingSix{
    
    public JFrame jFrame;

    public javaSwingSix() {
        jFrame = new JFrame("Example of ComboBox");
        jFrame.setTitle("Swing");
        
        String name[] = {"Mario", "Luigi", "Shaun"};
        JComboBox jComboBox = new JComboBox(name);
        jComboBox.setBounds(100, 20, 100, 20);

        JButton jButton = new JButton("Choose");
        jButton.setBounds(100, 150, 80, 30);

        JLabel jLabel = new JLabel("");
        jLabel.setBounds(100, 50, 250, 30);

        jFrame.add(jLabel);        
        jFrame.add(jComboBox);
        jFrame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("You selected "+jComboBox.getItemAt(jComboBox.getSelectedIndex()));
                System.out.println("Play");
              }
            });

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javaSwingSix j = new javaSwingSix();
    }
}

