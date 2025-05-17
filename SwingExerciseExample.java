//1. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either 
//Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockHourGlassApp extends JFrame {
    private JButton digitalClockButton;
    private JButton hourGlassButton;
    private JLabel messageLabel;

    public ClockHourGlassApp() {
        // Set up the frame
        setTitle("Clock and Hour Glass");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons with images
        digitalClockButton = new JButton(new ImageIcon("path/to/digital_clock_image.png"));
        hourGlassButton = new JButton(new ImageIcon("path/to/hour_glass_image.png"));

        // Create a label to display messages
        messageLabel = new JLabel("Press a button");

        // Add action listeners to buttons
        digitalClockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourGlassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to the frame
        add(digitalClockButton);
        add(hourGlassButton);
        add(messageLabel);
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClockHourGlassApp app = new ClockHourGlassApp();
                app.setVisible(true);
            }
        });
    }
}

//2. Develop a simple swing program for illustrating mouse operations such as mouse down, up double click , single click with help of a button
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseOperationsApp extends JFrame {
    private JButton button;
    private JLabel messageLabel;

    public MouseOperationsApp() {
        // Set up the frame
        setTitle("Mouse Operations Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a button
        button = new JButton("Click Me!");
        messageLabel = new JLabel("Mouse Events will be displayed here.");

        // Add mouse listener to the button
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                messageLabel.setText("Mouse Down");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                messageLabel.setText("Mouse Up");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    messageLabel.setText("Double Click");
                } else {
                    messageLabel.setText("Single Click");
                }
            }
        });

        // Add components to the frame
        add(button);
        add(messageLabel);
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            MouseOperationsApp app = new MouseOperationsApp();
            app.setVisible(true);
        });
    }
}
