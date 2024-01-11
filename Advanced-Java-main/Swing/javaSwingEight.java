//JList

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class javaSwingEight {
    
    public JFrame jFrame;

    public javaSwingEight() {
        jFrame = new JFrame("Example of JList");
        jFrame.setTitle("Swing");
        JLabel jLabel = new JLabel();
        jLabel.setBounds(200, 100, 220, 30);
        JButton jButton = new JButton("Submit");
        jButton.setBounds(100, 50, 150, 30);
        
        DefaultListModel<String> l1 = new DefaultListModel<String>();
        l1.addElement("Virat");
        l1.addElement("Rohit");
        l1.addElement("Ravindra");
        l1.addElement("MS");


        DefaultListModel<String> l2 = new DefaultListModel<String>();
        l2.addElement("Kohli");
        l2.addElement("Sharma");
        l2.addElement("Jadeja");
        l2.addElement("Dhoni");

        JList name = new JList(l1);
        name.setBounds(100, 100, 75, 75);

        JList surname = new JList(l2);
        surname.setBounds(100, 200, 75, 75);

        jFrame.add(jLabel);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Your fullname is "+name.getSelectedValue() +" "+ surname.getSelectedValue();
                jLabel.setText(data);
            }
        });

        jFrame.add(name);
        jFrame.add(surname);
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javaSwingEight j = new javaSwingEight();
    }
}
