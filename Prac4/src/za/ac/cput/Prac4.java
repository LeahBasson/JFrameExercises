package za.ac.cput;

import java.awt.*;
import javax.swing.*;

public class Prac4
        extends JFrame {

    // have to get this part
    // labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel mobileLbl;
    private JLabel studLbl;
    private JLabel addressLbl;

    // textfields
    private JTextField nameTxt;
    private JTextField mobileTxt;

    // radio buttons
    private JRadioButton underGrdRadio;
    private JRadioButton postGrdRadio;
    /**
     * group for radio buttons
     */
    private ButtonGroup group;

    // text area
    private JTextArea addressTxt;
    private JTextArea messageTxt;

    //checkbox
    private JCheckBox messageBox;
    
    // panels
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    // constructor
    public Prac4() {
        //call parent class constructor
        // set frame title
        super("Student Registration");

        // layout of the frame: rows, cols
        setLayout(new GridLayout(2, 1));

        // have to get this part
        // a box within the JFrame
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(1, 2));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));

        headingLbl = new JLabel("Student Registration");
        // style heading label
        headingLbl.setFont(new Font("Arial", Font.PLAIN, 24));
        
        nameTxt = new JTextField(15);
        nameLbl = new JLabel("Name"); 

        // adding content
        //add(panel1);
        add(headingLbl);
        add(panel2);
        panel2.add(panel3);
        panel2.add(panel4);
        
        panel3.add(nameLbl);
        panel3.add(nameTxt);

        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//        nameTxt = new JTextField(15);
//        nameLbl = new JLabel("Name");
//
//        mobileLbl = new JLabel("Mobile");
//        mobileTxt = new JTextField(15);
//        add(mobileLbl);
//        add(mobileTxt);
//        
//        messageTxt = new JTextArea(38, 24);
//        
//        studLbl = new JLabel("Student");
        // have to get this part
//        add(panel1);
//        add(panel2);
//        add(messageTxt);
    }

}// end of class
