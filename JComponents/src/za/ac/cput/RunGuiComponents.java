package za.ac.cput;

import javax.swing.*;

public class RunGuiComponents {

    public static void main(String[] args) {
        // GUI components

        GuiExample myGui = new GuiExample();
        myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGui.setSize(900, 600);
        myGui.setVisible(true);

    }// end of main

}// end of class
