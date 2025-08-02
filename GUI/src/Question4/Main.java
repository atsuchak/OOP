package Question4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    //variables
    JPanel panel;
    Font font, bFont;
    Cursor cursor;
    JLabel celLb, farLb;
    JTextField celTf, farTf;
    JButton convertFar, convertCel, clearCel, clearFar;

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
        celLb = new JLabel("Celsius value: ");
        celLb.setBounds(80, 20, 200, 30);
        celLb.setFont(bFont);
        panel.add(celLb);

        farLb = new JLabel("Fahrenheit value: ");
        farLb.setBounds(50, 200, 200, 30);
        farLb.setFont(bFont);
        panel.add(farLb);

        //textField
            celTf = new JTextField();
            celTf.setBounds(220, 20, 100, 30);
            celTf.setFont(bFont);
            celTf.setHorizontalAlignment(JTextField.CENTER);
            panel.add(celTf);

            farTf = new JTextField();
            farTf.setBounds(220, 200, 100, 30);
            farTf.setFont(bFont);
            farTf.setHorizontalAlignment(JTextField.CENTER);
            panel.add(farTf);

        //button
        clearCel = new JButton("Clear");
        clearCel.setBounds(350, 20, 90, 30);
        clearCel.setFont(bFont);
        clearCel.setCursor(cursor);
        panel.add(clearCel);

        clearFar = new JButton("Clear");
        clearFar.setBounds(350, 200, 90, 30);
        clearFar.setFont(bFont);
        clearFar.setCursor(cursor);
        panel.add(clearFar);

        convertFar = new JButton("Convert to Fahrenheit");
        convertFar.setBounds(120, 80, 300, 30);
        convertFar.setFont(bFont);
        convertFar.setCursor(cursor);
        panel.add(convertFar);

        convertCel = new JButton("Convert to Celsius");
        convertCel.setBounds(120, 130, 300, 30);
        convertCel.setFont(bFont);
        convertCel.setCursor(cursor);
        panel.add(convertCel);


        //actionListener
        convertFar.addActionListener(this);
        convertCel.addActionListener(this);
        clearCel.addActionListener(this);
        clearFar.addActionListener(this);

        //add panel and frame
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(convertFar)) {
            try {
                if(farTf.getText().isEmpty()) {
                    double val = Double.parseDouble(celTf.getText());
                    double result = (val * (9/5.0)) + 32;

                    String res = String.format("%.2f", result);
                    farTf.setText(res);
                }else {
                    JOptionPane.showMessageDialog(null, "Clear fahrenheit text field");
                }
            }catch (Exception ioe) {
                JOptionPane.showMessageDialog(null, "Exception found: " +ioe);
            }
        }else if(e.getSource().equals(convertCel)) {
            try {
                if(celTf.getText().isEmpty()) {
                    double val = Double.parseDouble(farTf.getText());
                    double result = (((val -32) * 5)/9.0);

                    String res = String.format("%.2f", result);
                    celTf.setText(res);
                }else {
                    JOptionPane.showMessageDialog(null, "Clear celsius text field");
                }
            }catch (Exception ioe) {
                JOptionPane.showMessageDialog(null, "Exception found: " +ioe);
            }
        }else if(e.getSource().equals(clearCel)) {
            celTf.setText(null);
        }else if(e.getSource().equals(clearFar)) {
            farTf.setText(null);
        }
    }

    public static void main(String[] args) {
            new Main();
    }
}
