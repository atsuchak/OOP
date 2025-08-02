package Question1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    //variables
    JPanel panel;
    Font font, bFont;
    Cursor cursor;
    JLabel counter;
    JTextField tf;
    JButton count, reset;
    int num = 0;

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

        //label
        counter = new JLabel("Counter");
        counter.setBounds(100, 20, 100, 30);
        counter.setFont(font);
        panel.add(counter);

        //textField
        tf = new JTextField();
        tf.setBounds(220, 20, 100, 30);
        tf.setFont(font);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setEditable(false);
        panel.add(tf);

        //button
        count = new JButton("Count");
        count.setBounds(120, 100, 100, 30);
        count.setFont(bFont);
        count.setCursor(cursor);
        panel.add(count);

        reset = new JButton("Reset");
        reset.setBounds(250, 100, 100, 30);
        reset.setFont(bFont);
        reset.setCursor(cursor);
        panel.add(reset);

        //actionListener
        count.addActionListener(this);
        reset.addActionListener(this);

        //add panel and frame
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(count)) {
                num++;
                tf.setText(String.valueOf(num));
        }if(e.getSource().equals(reset)) {
            tf.setText(null);
            num = 0;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
