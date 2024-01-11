import javax.swing.JFrame;

public class javaSwingOne {

    public javaSwingOne() {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("The first program of jFrame");
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        javaSwingOne j = new javaSwingOne();
    }
}




// import javax.swing.JFrame;

// public class javaSwingOne extends JFrame{

//     public javaSwingOne() {
//         setTitle("The first program of jFrame");
//         setLayout(null);
//         setSize(400, 400);
//         setVisible(true);
//     }
//     public static void main(String[] args) {
//         javaSwingOne j = new javaSwingOne();
//     }
// }



// import javax.swing.JFrame;

// public class javaSwingOne extends JFrame{

//     public static void main(String[] args) {
//         javaSwingOne j = new javaSwingOne();
//         j.setTitle("The first program of jFrame");
//         j.setLayout(null);
//         j.setSize(400, 400);
//         j.setVisible(true);
//     }
// }