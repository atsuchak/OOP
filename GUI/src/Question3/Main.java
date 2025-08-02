package Question3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    //variables
    JPanel panel;
    Font font, bFont;
    Cursor cursor;
    JCheckBox eat, sleep, repeat;
    JButton button;

    Main() {

        //frame
        setSize(500, 300);
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

        //checkbox
        eat = new JCheckBox("Eat");
        eat.setBounds(200, 20, 200, 30);
        eat.setBackground(Color.ORANGE);
        eat.setFont(font);
        panel.add(eat);

        sleep = new JCheckBox("Sleep");
        sleep.setBounds(200, 50, 200, 30);
        sleep.setBackground(Color.ORANGE);
        sleep.setFont(font);
        panel.add(sleep);

        repeat = new JCheckBox("Repeat");
        repeat.setBounds(200, 80, 200, 30);
        repeat.setBackground(Color.ORANGE);
        repeat.setFont(font);
        panel.add(repeat);

        //button
        button = new JButton("Check");
        button.setBounds(200, 150, 100, 30);
        button.setCursor(cursor);
        button.setFont(bFont);
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
            if(button.getText().equals("Check")) {
                eat.doClick();
                sleep.doClick();
                repeat.doClick();
                button.setBounds(200, 150, 120, 30);
                button.setText("Uncheck");
            }else {
                eat.doClick();
                sleep.doClick();
                repeat.doClick();
                button.setBounds(200, 150, 100, 30);
                button.setText("Check");
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
