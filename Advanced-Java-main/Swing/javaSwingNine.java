//Add Exit Dialog

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class javaSwingNine {
    
    public JFrame jFrame;

    public javaSwingNine() {
        jFrame = new JFrame("Add Exit Dialog");
        jFrame.setTitle("Swing");

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame, "Do you want to exit?");
                if(a == JOptionPane.YES_OPTION) {
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
        
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javaSwingNine j = new javaSwingNine();
    }
}
