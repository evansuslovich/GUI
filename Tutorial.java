import java.awt.Color; 
import javax.swing.JFrame; 
import java.awt.Graphics; 
import javax.swing.*;
import java.awt.BorderLayout;



public class Tutorial {

    public Tutorial(JFrame frame)
    {
        frame.setTitle("Tutorial");
        frame.setSize(960,960); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void panel(JPanel p1)
    {
        p1.setLayout(new BorderLayout()); 
        p1.setBackground(Color.green); 
         
    }

    public static void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawLine(5,5,955,955);
    }

    

    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); 
        JPanel p1 = new JPanel(); 


        new Tutorial(frame); 



    }
}