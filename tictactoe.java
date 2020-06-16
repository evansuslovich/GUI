import javax.swing.*;
import javax.swing.JFrame; 

import java.awt.Graphics; 
import java.awt.Color; 
import java.awt.BorderLayout;

public class tictactoe extends JFrame { 
    
    public void paint(Graphics g) 
    { 
        g.drawLine(200, 200, 600, 600); 
    } 

    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Tic-tac-toe");
        frame.setSize(800,800);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel pan1 = new JPanel(); 
        pan1.setLayout(new BorderLayout());
        pan1.setBackground(Color.GREEN); 

        JPanel pan2 = new JPanel(); 
        pan2.setLayout(new BorderLayout()); 
        pan2.setBackground(Color.ORANGE); 

        JPanel pan3 = new JPanel(); 
        pan3.setLayout(new BorderLayout()); 
        pan3.setBackground(Color.GRAY); 

        JButton jb1 = new JButton("PANEL 1");
        JButton jb2 = new JButton("PANEL 2"); 

        pan1.add(jb1,BorderLayout.NORTH); 
        pan2.add(jb2,BorderLayout.SOUTH);
         

        frame.add(pan1, BorderLayout.WEST); // GREEN AND WEST 
        frame.add(pan2, BorderLayout.EAST); // ORANGE AND EAST
        frame.add(pan3, BorderLayout.CENTER); 


        //JPanel pan4 = new JPanel(); 
        
        //pan4.setLayout(new GridLayout(3,3,5,5)); 

        /**JLabel one = new JLabel("one"); 
        JLabel two = new JLabel("two"); 
        JLabel three = new JLabel("three"); 
        JLabel four = new JLabel("four"); 
        JLabel five = new JLabel("five"); 
        JLabel six = new JLabel("six"); 
        JLabel seven = new JLabel("seven");
        JLabel eight = new JLabel("eight"); 
        JLabel nine = new JLabel("nine"); 

        pan4.add(one);
        pan4.add(two);
        pan4.add(three);
        pan4.add(four);
        pan4.add(five);
        pan4.add(six);
        pan4.add(seven);
        pan4.add(eight);
        pan4.add(nine);
        */ 
       

        

        
        
    }
}
