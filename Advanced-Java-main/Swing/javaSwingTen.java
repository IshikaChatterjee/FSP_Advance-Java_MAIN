//Scrollbar

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class javaSwingTen {
    
    public JFrame jFrame;

    public javaSwingTen() {
        jFrame = new JFrame("Add Exit Dialog");
        jFrame.setTitle("Swing");

        JLabel jLabel = new JLabel();
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setSize(400, 100);
        JScrollBar jScrollBar = new JScrollBar();
        jScrollBar.setBounds(100, 100, 20, 200);

        jFrame.add(jLabel);
        jFrame.add(jScrollBar);

        jScrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                jLabel.setText("Your position is "+jScrollBar.getValue());
            }
        });

        
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javaSwingTen j = new javaSwingTen();
    }
}
