package za.ac.cput;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GuiExample
        extends JFrame
        implements ActionListener {

    /**
     * declare label and text field
     */
    private JTextField nameTxt;
    private JLabel nameLbl;

    /**
     * declare buttons
     */
    private JButton blueBtn;
    private JButton pinkBtn;
    private JButton resetBtn;

    /**
     * declare radio buttons
     */
    private JRadioButton redRadio;
    private JRadioButton blueRadio;
    private JRadioButton greenRadio;
    /**
     * group for radio buttons
     */
    private ButtonGroup group;
    /**
     * declare text area
     */
    private JTextArea messageTxt;
    private JPanel panel1;

    /**
     * Constructor for objects of class GuiExample
     */
    public GuiExample() {
        //**call parent class constructor
        super();
        this.setTitle("Frame for components");

        /**
         * layout of the frame
         */
        setLayout(new FlowLayout());
//        setLayout(new GridLayout(2, 5));
//        setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 1));
        nameTxt = new JTextField(20);
        nameLbl = new JLabel("Enter your name");

        /**
         * declare buttons
         */
        blueBtn = new JButton("Blue");
        pinkBtn = new JButton("Pink");
        resetBtn = new JButton("Reset");

        /**
         * declare radio buttons
         */
        redRadio = new JRadioButton("Red");
        blueRadio = new JRadioButton("Blue");
        greenRadio = new JRadioButton("Green");
        /**
         * group for radio buttons
         */
        group = new ButtonGroup();

        /**
         * declare text area
         */
        messageTxt = new JTextArea(10, 40);

        /**
         * adding buttons to Frame
         */
        panel1.add(pinkBtn);
        panel1.add(blueBtn);
        panel1.add(resetBtn);
        this.add(panel1);

        /**
         * register components with listener
         */
        pinkBtn.addActionListener(this);
        blueBtn.addActionListener(this);

        /**
         * adding radio buttons group and to Frame
         */
        group.add(redRadio);
        group.add(blueRadio);
        group.add(greenRadio);
        add(redRadio);
        add(blueRadio);
        add(greenRadio);

        /**
         * adding text field and label to Frame
         */
        this.add(nameLbl);
        add(nameTxt);

        /**
         * adding text area to frame
         */
        add(messageTxt);
//        add(Messagetxt,  BorderLayout.CENTER);

        /**
         * set color of JButton objects
         */
        blueBtn.setBackground(Color.lightGray);
        pinkBtn.setBackground(Color.lightGray);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pinkBtn) {
            pinkBtn.setBackground(Color.pink);
        } else if (e.getSource() == blueBtn) {
            blueBtn.setBackground(Color.blue);
            blueBtn.setForeground(Color.white);
        }
    }

}//end class

