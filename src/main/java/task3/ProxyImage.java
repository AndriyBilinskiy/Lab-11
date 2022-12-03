package task3;

import javax.swing.*;

public class ProxyImage implements MyImage{
    private String filename;
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
