 
package za.ac.cput;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxExample extends JFrame implements ItemListener{
    private JComboBox<String> cboTeams;
    
    public JComboBoxExample(){
        super("ComboBox Example");
        
        setLayout(new FlowLayout());
        
        cboTeams = new JComboBox();
        
        cboTeams.addItem("-- make selection --");
        cboTeams.addItem("Liverpool");
        cboTeams.addItem("Arsenal");
        cboTeams.addItem("Manchester United");
        
        cboTeams.addItemListener(this);
        
        add(cboTeams);
          
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED){
            String query = cboTeams.getSelectedItem().toString();
            if(!query.equals("-- make selection --")){
                JOptionPane.showMessageDialog(null,query);
            }
        }
        
    }
   
}// end of class
