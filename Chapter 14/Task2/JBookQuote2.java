/**
 * Created by jc428209 on 16/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote2 extends JFrame{

    public JBookQuote2() {
        super("TESTING");
        setSize(800,200);
        JPanel panel = new JPanel(new FlowLayout());
        JLabel label1 = new JLabel("Spooks");
        label1.setText("An assassin lurks in the darkness between earth and oblivion - but who are they, and what is their mission?");
        add(panel);
        panel.add(label1);
        JButton button1 = new JButton();
        button1.setText("Display Title");
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel label2 = new JLabel("Book Title");
                label2.setText("Spooks Apprentice");
                panel.add(label2);
                repaint();
                revalidate();
            }
        });

    }

    public static void main(String[] args) {
        JBookQuote2 bookQuote = new JBookQuote2();
        bookQuote.setVisible(true);
    }
}
