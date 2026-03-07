package za.ac.cput;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prac4
        extends JFrame
        implements ActionListener, ItemListener {

    // have to get this part
    // labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel mobileLbl;
    private JLabel studLbl;
    private JLabel addressLbl;
    private JLabel checkBoxLbl;
    private JLabel buttonsLbl;
    private JLabel dobLbl;

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
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;

    // buttons
    private JButton submitBtn;
    private JButton resetBtn;
    
    // combo box
    private JComboBox<String> cboTeams;

    // constructor
    public Prac4() {
        //**call parent class constructor
        super("Student Registration");

        /**
         * layout of the frame
         */
        setLayout(new GridLayout(1, 2));
        // have to get this part
        // a box within the JFrame
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();


        // rows, cols
        panel1.setLayout(new GridLayout(7, 2));
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());
        panel4.setLayout(new FlowLayout());
        panel5.setLayout(new FlowLayout());
        
        // labels     
        nameLbl = new JLabel("Name");
        headingLbl = new JLabel("Student Registration");
        mobileLbl = new JLabel("Mobile");
        studLbl = new JLabel("Student");
        addressLbl = new JLabel("Address");
        checkBoxLbl = new JLabel(" ");
        buttonsLbl = new JLabel("");
        dobLbl = new JLabel("Birth date");
        

        // textfields
        nameTxt = new JTextField(10);
        mobileTxt = new JTextField(10);

        // radio buttons
        underGrdRadio = new JRadioButton("undergraduate");
        postGrdRadio = new JRadioButton("postgraduate");
        group = new ButtonGroup();

        // text area
        addressTxt = new JTextArea(10, 40);
        messageTxt = new JTextArea(10, 40);

        // checkbox
        messageBox = new JCheckBox("Accept Terms and Conditions.");

        // buttons
        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        
        // combo box
        cboTeams = new JComboBox();

        // have to get this part
        //add(headingLbl);
        panel1.add(nameLbl);
        panel1.add(nameTxt);
        panel1.add(mobileLbl);
        panel1.add(mobileTxt);

        panel1.add(studLbl);
        // allows you to only select 1 at a time.
        group.add(underGrdRadio);
        group.add(postGrdRadio);
        
        panel3.add(underGrdRadio);
        panel3.add(postGrdRadio);
        panel1.add(panel3);
        

        panel1.add(addressLbl);
        panel1.add(addressTxt);
        
        
        panel5.add(dobLbl);
        panel5.add(cboTeams);
        
        cboTeams.addItem("-- make selection --");
        cboTeams.addItem("Liverpool");
        cboTeams.addItem("Arsenal");
        cboTeams.addItem("Manchester United");
        
        panel1.add(panel5);
        
        panel1.add(checkBoxLbl);
        panel1.add(messageBox);
       
        panel1.add(buttonsLbl);
        panel4.add(submitBtn);
        panel4.add(resetBtn);
        panel1.add(panel4);
        
        add(panel1);

        submitBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        cboTeams.addItemListener(this);

        panel2.add(messageTxt);
        add(panel2);

        // style heading label
        headingLbl.setFont(new Font("Arial", Font.PLAIN, 24));
        messageTxt.setEnabled(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Display all the user-entered values into the textarea
        if (e.getSource() == resetBtn) {
            nameTxt.setText("");
            mobileTxt.setText("");
            // FIX: apply the functionality to the button group.
            group.clearSelection();

            addressTxt.setText("");
            messageBox.setSelected(false);
            messageTxt.setText("");

        }

        if (e.getSource() == submitBtn) {

            if (underGrdRadio.isSelected()) {
                messageTxt.setText(
                        nameTxt.getText() + "\n" + mobileTxt.
                        getText() + "\n" + underGrdRadio.getText() + "\n" + addressTxt.
                        getText());
            }

            if (postGrdRadio.isSelected()) {
                messageTxt.setText(
                        nameTxt.getText() + "\n" + mobileTxt.
                        getText() + "\n" + postGrdRadio.getText() + "\n" + addressTxt.
                        getText());
            }

        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
}// end of class
