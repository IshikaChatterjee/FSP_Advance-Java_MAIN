import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.awt.Font;
import java.net.URL;

public class NodepadUsingSwing implements ActionListener {

    public JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu file, edit, format, submenu;
    JMenuItem cut, copy, paste, save, exit, zoomIn, zoomOut, delete, check;
    JTextArea jTextArea;
    Font currentFont;

    public NodepadUsingSwing() {
        jFrame = new JFrame("JMenuBar");
        jFrame.setTitle("Mini Notepad");

        jTextArea = new JTextArea();
        jTextArea.setBounds(5, 5, 360, 320);

        jMenuBar = new JMenuBar();

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        zoomIn = new JMenuItem("Zoom In + ");
        zoomOut = new JMenuItem("Zoom Out - ");
        delete = new JMenuItem("Delete");
        check = new JMenuItem("Check");

        save.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        zoomIn.addActionListener(this);
        zoomOut.addActionListener(this);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("");
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame, "Do yo want to exit?");
                if (a == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textToCheck = jTextArea.getText().trim();
                String[] words = textToCheck.split("\\s+");

                StringBuilder result = new StringBuilder();
                for (String word : words) {
                    boolean isValidWord = isValidEnglishWord(word);
                    result.append(word).append(isValidWord ? " - Valid Word" : " - Invalid Word").append("\n");
                }
                JOptionPane.showMessageDialog(jFrame, result.toString());
            }
        });

        file = new JMenu("File");
        file.add(save);
        file.add(exit);

        edit = new JMenu("Edit");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        format = new JMenu("Format");
        format.add(zoomIn);
        format.add(zoomOut);

        submenu = new JMenu("Sub Menu");
        file.add(submenu);

        submenu.add(delete);
        submenu.add(check);

        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(format);

        jFrame.add(jTextArea);
        jFrame.add(jMenuBar);
        jFrame.setJMenuBar(jMenuBar);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);

        currentFont = jTextArea.getFont();

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame, "Do you want to exit?");
                if (a == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            jTextArea.cut();
        } else if (e.getSource() == copy) {
            jTextArea.copy();
        } else if (e.getSource() == paste) {
            jTextArea.paste();
        } else if (e.getSource() == zoomIn) {
            zoomIn();
        } else if (e.getSource() == zoomOut) {
            zoomOut();
        } else if (e.getSource() == save) {
            saveTextToFile();
        }
    }

    private void zoomIn() {
        Font font = jTextArea.getFont();
        float size = font.getSize() + 2.0f;
        jTextArea.setFont(font.deriveFont(size));
    }

    private void zoomOut() {
        Font font = jTextArea.getFont();
        float size = font.getSize() - 2.0f;
        jTextArea.setFont(font.deriveFont(size));
    }

    private void saveTextToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(jFrame);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String filePath = file.getAbsolutePath();

            if (!filePath.endsWith(".txt")) {
                file = new File(filePath + ".txt");
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(jTextArea.getText());
                JOptionPane.showMessageDialog(jFrame, "File saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(jFrame, "Error saving the file.");
            }
        }
    }

    private boolean isValidEnglishWord(String word) {
        String apiKey = "YOUR_API_KEY";
        String apiUrl = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-RapidAPI-Key", apiKey);

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        NodepadUsingSwing ns = new NodepadUsingSwing();
    }
}
