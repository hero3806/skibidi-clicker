package brainrotMaxing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SkibidiApp {

    // global integers

    static int count = 0;
    static int multiplier = 1;

    public static void main(String[] args) {

        final JFrame frame = new JFrame();
        final JButton Clicker = new JButton(new ImageIcon("skibidiToilet.png"));
        final JButton upg1Button = new JButton();
        final JLabel upg1Cost = new JLabel();
        final JButton upg2Button = new JButton();
        final JLabel upg2Cost = new JLabel();
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
        Clicker.setText("Click Me");
        Clicker.setFont(new Font("Arial", Font.PLAIN, 40));

        upg1Button.setBounds(0, 0, 75, 50);
        upg1Button.setText("x2 Clicks");

        upg1Cost.setBounds(5, 29, 75, 50);
        upg1Cost.setText("50 Clicks");
        upg1Cost.setFont(new Font("Fredroka One", Font.BOLD, 14));
        upg1Cost.setForeground(new Color(50, 50, 50));

        upg2Button.setBounds(0, 75, 75, 50);
        upg2Button.setText("x3 Clicks");

        upg2Cost.setBounds(0, 104, 100, 50);
        upg2Cost.setText("150 Clicks");
        upg2Cost.setFont(new Font("Fredroka One", Font.BOLD, 14));
        upg2Cost.setForeground(new Color(50, 50, 50));

        upg1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (count >= 50) {
                    count = count - 50;
                    multiplier = 2;
                    counterLabel.setText("toilet clicked: " + count);
                }
            }
        });

        upg2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (count >= 150) {
                    count = count - 150;
                    multiplier = 3;
                    counterLabel.setText("toilet clicked: " + count);
                }
            }
        });

        Clicker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = count + multiplier;
                counterLabel.setText("toilet clicked: " + count);
            }
        });

        frame.add(Clicker);
        frame.add(upg1Button);
        frame.add(upg1Cost);
        frame.add(upg2Button);
        frame.add(upg2Cost);
        frame.add(counterLabel);
    }
}
