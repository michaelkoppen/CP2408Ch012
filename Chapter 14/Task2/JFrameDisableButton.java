/**
 * Created by jc428209 on 16/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame {

    public JFrameDisableButton() {
        //super("DisableButton");
        setSize(800,200);
        JPanel panel = new JPanel(new FlowLayout());
        add(panel);
        JButton button = new JButton();
        button.setText("Click to disable");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setVisible(false);
            }
        });

    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setVisible(true);

    }
}
