package Question5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    //variables
    JPanel panel;
    Font font, bFont;
    Cursor cursor;
    JButton button;

    Main() {

        //frame
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //panel
        panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);

        //font
        font = new Font("Roboto", Font.BOLD, 24);
        bFont = new Font("Roboto", Font.BOLD, 18);

        //cursor
        cursor = new Cursor(Cursor.HAND_CURSOR);

        //button
        button = new JButton("Click");
        button.setBounds(100, 100, 100, 30);
        button.setFont(bFont);
        button.setCursor(cursor);
        panel.add(button);

        //actionListener

        button.addActionListener(this);

        //add panel and frame
        add(panel);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)) {
            JOptionPane.showMessageDialog(null, "Alice in OOP Land");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
