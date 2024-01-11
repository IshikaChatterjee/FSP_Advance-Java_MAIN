//JTable

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class javaSwingSeven {
    
    public JFrame jFrame;

    String data[][] = {
        {"1", "Goku", "UltraInstinct"},
        {"2", "Vegeta", "UltraEgo"},
        {"3", "Frieza", "BlackFrieza"}
    };
    String col[] = {"id", "name", "Powerful form"};

    final JTable jTable = new JTable(data, col);

    public javaSwingSeven() {
        jFrame = new JFrame("Example of JTable");
        jFrame.setTitle("Swing");

        jTable.setCellSelectionEnabled(true);
        ListSelectionModel selectionModel = jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String data = null;
                int[] row = jTable.getSelectedRows();
                int[] col = jTable.getSelectedColumns();

                for(int i = 0; i<row.length; i++) {
                    for(int j = 0; j<col.length; j ++) {
                        data = (String) jTable.getValueAt(row[i], col[j]);
                    }
                }

            System.out.println("You selected this hero: " +data);
            }
        });

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jFrame.add(jScrollPane);

        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javaSwingSeven j = new javaSwingSeven();
    }
}
