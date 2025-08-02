import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Main {

    Main() {
        JFrame jf = new JFrame("CtoF Converter - OOP Final");
        jf.setSize(450, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        JPanel jp = new JPanel();
        jp.setLayout(null);

        Font font = new Font("Roboto", Font.PLAIN, 16);

        JLabel celsius = new JLabel("Enter celsius value: ");
        celsius.setBounds(60, 10, 250, 50);
        celsius.setFont(font);
        jp.add(celsius);

        JFormattedTextField celsiusTf = new JFormattedTextField(NumberFormat.getNumberInstance());
        celsiusTf.setBounds(200, 25, 150, 25);
        celsiusTf.setFont(font);
        jp.add(celsiusTf);

        JLabel c = new JLabel("C");
        c.setBounds(370, 10, 30, 50);
        c.setFont(font);
        jp.add(c);

        JButton jb = new JButton("Convert to Fahrenheit");
        jb.setBounds(75, 65, 200, 30);
        jb.setFont(font);
        jp.add(jb);

        JLabel fahrenheit = new JLabel("Fahrenheit value: ");
        fahrenheit.setBounds(75, 100, 250, 50);
        fahrenheit.setFont(font);
        jp.add(fahrenheit);

        JFormattedTextField fahrenheitTf = new JFormattedTextField(NumberFormat.getNumberInstance());
        fahrenheitTf.setBounds(200, 115, 150, 25);
        fahrenheitTf.setFont(font);
        jp.add(fahrenheitTf);

        c = new JLabel("F");
        c.setBounds(370, 100, 30, 50);
        c.setFont(font);
        jp.add(c);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double celsiusVal = Double.parseDouble(celsiusTf.getText());
                double fahrenheitVal = (celsiusVal * (9.0/5)) + 32;
                fahrenheitTf.setText(String.valueOf(fahrenheitVal));
            }
        });

        jf.add(jp);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
