import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc428209 on 16/10/17.
 */
public class JFrameDisableButton2 extends JFrame {
    int timesPressed = 0;
    public JFrameDisableButton2() {
        JPanel panel = new JPanel(new FlowLayout());
        setSize(800,200);
        setVisible(true);
        JButton button = new JButton();
        button.setText("Click to disable");
        add(panel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timesPressed++;
                if(timesPressed >= 8) {
                    button.setVisible(false);
                }
            }
        });
        panel.add(button);
    }

    public static void main(String[] args) {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
    }
}

