import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel; 
import java.awt.Color;
import java.awt.BorderLayout;

public class panel {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("PanelBackground"); 
        frame.setSize(450,450); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        
        JPanel p1 = new JPanel(); 
        

        ImageIcon background = new ImageIcon("background.png");

        JLabel j1 = new JLabel(background); 
        p1.setBackground(Color.GRAY);
        p1.add(j1, BorderLayout.CENTER); 
       

        frame.add(p1); 
        frame.setVisible(true); 
    }
}