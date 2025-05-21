//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockButtonDemo extends JFrame {

    JLabel messageLabel;

    public ClockButtonDemo() {
        setTitle("Clock Button Example");
        setSize(500, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Message label
        messageLabel = new JLabel(" ");
        messageLabel.setBounds(100, 20, 300, 30);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(messageLabel);

        // Digital clock image button
        ImageIcon digitalIcon = new ImageIcon("digital.png"); // Use your image file here
        JButton digitalButton = new JButton(digitalIcon);
        digitalButton.setBounds(100, 70, 100, 100);
        digitalButton.setToolTipText("Digital Clock");

        // Hourglass image button
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png"); // Use your image file here
        JButton hourglassButton = new JButton(hourglassIcon);
        hourglassButton.setBounds(280, 70, 100, 100);
        hourglassButton.setToolTipText("Hour Glass");

        // Action listeners
        digitalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("You have pressed digital clock!");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("You have pressed hour glass!");
            }
        });

        // Add components
        add(digitalButton);
        add(hourglassButton);
        add(messageLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ClockButtonDemo();
    }
}
