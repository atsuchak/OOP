import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        Font font = new Font("Roboto", Font.PLAIN, 16);

        JTextField accTf = new JTextField();
        accTf.setBounds(100, 30, 180, 40);
        accTf.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        accTf.setFont(font);
        panel.add(accTf);

        JButton search = new JButton("Search");
        search.setBounds(300, 30, 100, 40);
        search.setFont(font);
        search.setBackground(new Color(153, 204, 255));
        panel.add(search);



        JTextField depTf = new JTextField();
        depTf.setBounds(100, 250, 180, 40);
        depTf.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        depTf.setFont(font);
        panel.add(depTf);

        JButton dep = new JButton("Deposit");
        dep.setBounds(300, 250, 100, 40);
        dep.setFont(font);
        dep.setBackground(new Color(153, 204, 255));
        panel.add(dep);

        JTextField withTf = new JTextField();
        withTf.setBounds(100, 300, 180, 40);
        withTf.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        withTf.setFont(font);
        panel.add(withTf);

        JButton with = new JButton("Withdraw");
        with.setBounds(300, 300, 100, 40);
        with.setFont(font);
        with.setBackground(new Color(153, 204, 255));
        panel.add(with);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
