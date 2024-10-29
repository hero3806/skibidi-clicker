package brainrotMaxing;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SkibidiApp {

    static int count = 0;

    public static void main(String[] args) {

        final JFrame frame = new JFrame();
        final JButton Clicker = new JButton(new ImageIcon("skibidiToilet.png"));
        final JLabel counterLabel = new JLabel();

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setTitle("Skibidi Clicker");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        counterLabel.setVisible(true);
        counterLabel.setFont(new Font("fredoka one", Font.PLAIN, 25));
        counterLabel.setText("toilet clicked: " + count);
        counterLabel.setHorizontalAlignment(0);
        counterLabel.setVerticalAlignment(1);
        counterLabel.setToolTipText("github wont allow this");

        Clicker.setBounds(150, 150, 200, 200);
        Clicker.setVisible(true);
        Clicker.setEnabled(true);
        Clicker.setText("click 4 smth");

        Clicker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                counterLabel.setText("toilet clicked: " + count);
            }
        });

        frame.add(Clicker);
        frame.add(counterLabel);
    }
}
