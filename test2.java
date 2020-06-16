import javax.swing.*; 
import java.awt.*; 
public class test2 {

    public static void main(String[] args)
    
    {
        JFrame f = new JFrame(); 
        f.setSize(600,400); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new GridBagLayout()); 

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2"); 

        // how do we rearrange the componenets 

        // GridBadLayout helps us arrange 

        GridBagConstraints c = new GridBagConstraints();
        // using this object we will arranging our componenets on the panel 

        c.insets = new Insets(10,10,10,10); 

        c.gridx = 0; 
        c.gridy = 1; 
        p.add(b1,c); 
        
        c.gridx = 0; 
        c.gridy = 2; 
        p.add(b2,c); 
        // add the buttons to the panel 

        f.add(p, BorderLayout.WEST); 



        

        f.setVisible(true);


       
    }


}