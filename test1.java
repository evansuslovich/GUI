
import javax.swing.*;
import java.awt.*; 

public class test1 {

    private JFrame f; 
    private JPanel p; 
    private JButton b1; 
    private JLabel lab; 

    public test1()
    {
        gui(); 
    }

    public void gui()
    {
        f = new JFrame("Creative Test"); 
        f.setVisible(true);
        f.setSize(600,400); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this sets the entire box 
        // allows it to be visible 
        // changes the size 
        // and closes 

        p = new JPanel();
        p.setBackground(Color.yellow);

        // the Jpanel is what is inside 
        // it sets the color to yellow 

        b1 = new JButton("Test"); 
        // this sets the button –– the button has "Test" on it 
        lab = new JLabel("This is a test label");
        // this makes the label next to the button 
        
        p.add(b1);
        // since p is everything inside the JFRAME or the Frame 
        // everything has to go inside of it 
        // here we are adding the button to the PANEL -- everything inside the FRAME 
        p.add(lab);
        // here we are adding the lable "This is a test label" to the PANEL 

        // finallyi in order to get everything inside the JFRAME -- we have to add 
        // "p" or the panel to the JFrame 
        
        


        // added the panel to the frame 
        // for example: adding the art inside the frame 
        f.add(p,BorderLayout.SOUTH); 
        // this adds the button to the bottom 
    }
    
    public static void main (String[] args)
    {
        new test1();

     

    }

}