package za.ac.cput;

import javax.swing.JFrame;

public class RunSwingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingDemo demo = new SwingDemo();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setSize(800, 800);
        demo.setVisible(true);
    }// end of main

}// end of class
