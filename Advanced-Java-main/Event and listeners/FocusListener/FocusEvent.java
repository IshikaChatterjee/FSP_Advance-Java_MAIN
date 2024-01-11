import javax.swing.JFrame;

public class FocusEvent {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Focus Event Example");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

