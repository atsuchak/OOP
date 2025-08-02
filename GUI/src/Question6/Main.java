package Question6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    //variables
    JPanel panel;
    Font font, bFont;
    Cursor cursor;
    JButton button1, button2;

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
        button1 = new JButton("Button 1");
        button1.setBounds(20, 100, 120, 30);
        button1.setFont(bFont);
        button1.setBackground(Color.RED);
        button1.setCursor(cursor);
        panel.add(button1);

        button2 = new JButton("Button 2");
        button2.setBounds(150, 100, 120, 30);
        button2.setFont(bFont);
        button2.setBackground(Color.BLUE);
        button2.setCursor(cursor);
        panel.add(button2);

        //actionListener
        button1.addActionListener(this);
        button2.addActionListener(this);

        //add panel and frame
        add(panel);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button1)) {
            if (button1.getBackground().equals(Color.RED)) {
                button1.setBackground(Color.GREEN);
            }else {
                button1.setBackground(Color.RED);
            }
        }else if(e.getSource().equals(button2)) {
            if (button2.getBackground().equals(Color.BLUE)) {
                button2.setBackground(Color.CYAN);
            }else {
                button2.setBackground(Color.BLUE);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
