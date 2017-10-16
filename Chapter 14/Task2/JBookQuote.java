/**
 * Created by jc428209 on 16/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote extends JFrame {

    public JBookQuote() {
        super("TESTING");
        setSize(800,200);
        JLabel label1 = new JLabel("Spooks");
        label1.setText("An assassin lurks in the darkness between earth and oblivion - but who are they, and what is their mission?");
        add(label1);
    }

    public static void main(String[] args) {
        JBookQuote bookQuote = new JBookQuote();
        bookQuote.setVisible(true);
    }
}
