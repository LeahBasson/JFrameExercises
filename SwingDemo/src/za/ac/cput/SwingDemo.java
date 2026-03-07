package za.ac.cput;

import java.awt.GridLayout;
import javax.swing.*;

public class SwingDemo
        extends JFrame {

    // attributes
    private JButton btnClick;
    private JLabel lblText;
    private JLabel lblPicture;
    private JTextField txtYourText;
    private JTextArea taText;

    public SwingDemo() {
        // This class is declared as a subclass of JFrame.
        // Therefore, we have to call the parent class constructor first, by using the keyword 'super'.

        super("Swing components");

        // A GridLayout divides the frame into rows and columns
        setLayout(new GridLayout(4, 2));

        // Construct Swing objects
        btnClick = new JButton("Click");
        lblText = new JLabel();
        lblPicture = new JLabel();
        txtYourText = new JTextField(15);
        taText = new JTextArea(5, 10);

        // Then add the Swing objects to your frame 
        add(btnClick);
        add(lblText);
        add(lblPicture);
        add(txtYourText);
        add(taText);

        // A label can be used for text        
        lblText.setText("some value");

        // A label can be used for images        
        lblPicture.setIcon(new ImageIcon("bird-flying.gif"));

        // A textarea is used for a single line of input (or output).        
        // If you type in multiple lines of text in the textarea
        // and the text goes out of the scope of the area
        // then you can use a JScrollPane object
        // then instead of adding taText to the frame, you add the scrollpane
        // If we don't add the radio buttons to a button group then they will 
        // operate independently. That means we could select all of them at the 
        // same time.
        // We want to display the radio buttons as a group, 
        // not as seperate components. So we will use a panel for this.
        // Set a layout for the panel.
        // Then add the radio buttons to the panel.
        // Then add the panel to the frame
        // You can also add a border around the panel.
    }
}// end of class
