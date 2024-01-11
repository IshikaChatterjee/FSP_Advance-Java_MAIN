import javax.swing.JFrame;

public class KeyEvent1 {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Key Event Example");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
