import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    // Constructor
    public MainMenu() {
        // Set the title for the frame
        super("SNAKE GAME");

        // Set the size of the frame
        setSize(700, 700);

        // Set the default close operation for the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the components
        JPanel panel = new JPanel();

        // Set the layout manager for the panel
        panel.setLayout(new FlowLayout());

        // Create a label for the main menu
        JLabel label = new JLabel("SNAKE GAME");

        // Create buttons for the main menu options
        JButton option1Button = new JButton("Start");

        //add an action listener to the button
        option1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        // Add the label and buttons to the panel
        panel.add(label);
        panel.add(option1Button);


        // Add the panel to the frame
        add(panel);

        // Show the frame
        setVisible(true);
    }

}
