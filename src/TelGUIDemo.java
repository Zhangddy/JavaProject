import javax.swing.*;
import java.awt.*;

public class TelGUIDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("拨号");

        f.setSize(300, 400);
        f.setLocation(300, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3));
        JButton[] jButtons = new JButton[13];

        jButtons[0] = new JButton("1");
        jButtons[1] = new JButton("2");
        jButtons[2] = new JButton("3");
        jButtons[3] = new JButton("4");
        jButtons[4] = new JButton("5");
        jButtons[5] = new JButton("6");
        jButtons[6] = new JButton("7");
        jButtons[7] = new JButton("8");
        jButtons[8] = new JButton("9");
        jButtons[9] = new JButton("*");
        jButtons[10] = new JButton("0");
        jButtons[11] = new JButton("#");
        jButtons[12] = new JButton("拨打");

        for (int i = 0; i < 13; i++) {
            panel.add(jButtons[i]);
        }
        f.add(panel);
        f.setVisible(true);
    }
}
