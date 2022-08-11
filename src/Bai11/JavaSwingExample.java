package JavaK86.core.Bai11;

import javax.swing.*;

public class JavaSwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame");
        JPanel p = new JPanel();
        JButton button = new JButton("Click me");
        p.add(button);

        JLabel nameLabel = new JLabel("Name");

        JTextField textField = new JTextField();
        textField.setColumns(10);

        p.add(nameLabel);
        p.add(textField);
        f.add(p);
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JDialog d = new JDialog(new JFrame(),"Dialog Example");
        JLabel l = new JLabel("This is a dialog frame");
        l.setBounds(10,10,100,20);
        d.add(l);
        d.setBounds(200,200,200,200);
        d.setVisible(true);
    }
}
