/**
 * Created by jc428209 on 16/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class JHistoricalFacts extends JFrame{
    String[] facts = {"Fact1", "Fact2", "Fact3", "Fact4", "Fact5"};
    public JHistoricalFacts() {
        JPanel panel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("FactLabel");
        setSize(800,600);
        label.setText(facts[0]);
        JButton button = new JButton();
        Random randomGenerator = new Random();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(facts[randomGenerator.nextInt(5)]);
            }
        });
        panel.add(label);
        panel.add(button);
        add(panel);
    }

    public static void main(String[] args) {
        JHistoricalFacts panel = new JHistoricalFacts();
        panel.setVisible(true);
    }
}
