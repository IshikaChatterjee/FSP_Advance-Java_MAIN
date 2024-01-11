import javax.swing.JFrame;

public class WindowEvent {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Window Event Example");
        f.setBounds(100,100,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}