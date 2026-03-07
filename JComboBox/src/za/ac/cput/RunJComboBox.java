package za.ac.cput;

import javax.swing.JFrame;


public class RunJComboBox {

    
    public static void main(String[] args) {
        JComboBoxExample cboTeams = new JComboBoxExample();
        
        // Method to enable you to close frame
        cboTeams.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cboTeams.setSize(900, 600);
        
        cboTeams.setVisible(true);
        
    }// end of main
    
}// end of class
