package za.ac.cput;

import javax.swing.JFrame;

public class RunPrac4 {

    public static void main(String[] args) {
        // have to get this part

        Prac4 myGui = new Prac4();

        // Method to enable you to close frame
        myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Size of frame
        myGui.setSize(900, 600);

        // Frame is invisible by default, method to make it visible.
        myGui.setVisible(true);

    }// end of main

}// end of class
