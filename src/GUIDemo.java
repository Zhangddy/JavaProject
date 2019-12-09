import javax.swing.*;
import java.awt.*;

// 用swing组件来实现用户注册界面的实现（不需要事件处理代码）,
// 用户的注册信息包括（用户名，密码，QQ号，电子邮件，性别）
// （注意考虑用户的操作便利性选择合适的组件）
public class GUIDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("用户注册界面");
        f.setLayout(new GridLayout(6, 1, 10, 10));
        f.setSize(300, 400);
        f.setLocation(300, 400);

        JPanel[] panels = new JPanel[5];
        JLabel[] labels = new JLabel[5];
        labels[0] = new JLabel("用户名");
        labels[1] = new JLabel("密码");
        labels[2] = new JLabel("QQ号");
        labels[3] = new JLabel("电子邮件");
        labels[4] = new JLabel("性别");
        JTextField[] inputField = new JTextField[5];
        
        for (int i = 0; i < 5; i++) {
            inputField[i] = new JTextField(20);
            panels[i] = new JPanel();
            panels[i].add(labels[i]);
            panels[i].add(inputField[i]);
            f.add(panels[i]);
        }
        // 放最后一个确认按钮
        JButton jButton = new JButton("提交");
        f.add(jButton);
        f.setVisible(true);
    }

}
