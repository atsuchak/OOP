package Question7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest extends JFrame implements ActionListener {

    JTextField tf1, tf2;
    JButton button;
    String[] oceans;

    GUITest() {
        setTitle("Oceans App");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        oceans = new String[]{"Arctic", "North Atlantic", "South Atlantic", "Indian", "North Pacific", "south Pacific", "Antarctic"};

        tf1 = new JTextField(25);
        add(tf1);
        tf2 = new JTextField(25);
        add(tf2);

        button = new JButton("Show");
        add(button);

        button.addActionListener(this);
        tf1.addActionListener(this);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)) {
            try {
                int index = Integer.parseInt(tf1.getText());
                tf2.setText(oceans[index]);
            }catch (Exception ioe) {
                JOptionPane.showMessageDialog(null, "Exception found: " +ioe);
            }
        }else if(e.getSource().equals(tf1)) {
            button.doClick();
        }
    }

    public static void main(String[] args) {
        new GUITest();
    }
}
