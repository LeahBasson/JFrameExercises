
package za.ac.cput;

import java.awt.*;
import javax.swing.*;


public class Prac4 extends JFrame{
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
    /**group for radio buttons*/
    private ButtonGroup group;            
    
    // text area
    private JTextArea addressTxt;
    private JTextArea messageTxt;
    
    //checkbox
    private JCheckBox messageBox;
    private JPanel panel1;
    private JPanel panel2;
   
    // constructor
    public Prac4(){
        //**call parent class constructor
        super("Student Registration");
        
        /**layout of the frame */
        setLayout(new FlowLayout());
        
        // have to get this part
        
        // a box within the JFrame
        panel1 = new JPanel();
        
        // rows, cols
        //panel1.setLayout(new GridLayout(2,2)); 
        nameTxt = new JTextField(10);
        nameLbl = new JLabel("Name");
        headingLbl = new JLabel("Student Registration");
        mobileLbl = new JLabel("Mobile");
        mobileTxt = new JTextField(10);
        
        studLbl = new JLabel("Student");
        
        // have to get this part
        
        //add(panel1);
        add(headingLbl);
        add(nameLbl);
        add(nameTxt);
        add(mobileLbl);
        add(mobileTxt);
        
        // style heading label
        headingLbl.setFont(new Font("Arial", Font.PLAIN, 24));
        
          
    }
    
}// end of class
