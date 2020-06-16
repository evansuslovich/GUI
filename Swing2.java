// How about creating a chat frame 
// Usually you wil require both swing and awt packages 
// evin if you are working with just swings 
import javax.swing.*; 
import java.awt.*; 
public class Swing2 {

    public static void main(String[] args)
    { 
        //Creating the frame
        JFrame frame = new JFrame("Chat Frame"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        // Creating the MenuBar and adding comments 

        JMenuBar mb = new JMenuBar(); 
        JMenu m1 = new JMenu("File"); 
        JMenu m2 = new JMenu("Help"); 

        mb.add(m1); 
        mb.add(m2); 

        JMenuItem m11 = new JMenuItem("Open"); 
        JMenuItem m22 = new JMenuItem("Save as"); 

        m1.add(m11); 
        m2.add(m22); 

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); 

        JLabel label = new JLabel("Enter Text"); 

        JTextField tf = new JTextField(10); // accepts up to 10 characters 

        JButton send = new JButton("Send"); 
        JButton reset = new JButton("Reset"); 

        panel.add(label); 
        //Components added using FLowLayout 

        panel.add(tf); // Text Field 
        panel.add(send); 
        panel.add(reset); 

        

        //Text Area at the Center 
        JTextArea ta = new JTextArea(); 

        //Adding Components to the Frame 
        frame.getContentPane().add(BorderLayout.SOUTH, panel); 
        // panel :  
            // 1: label   "Enter Text"
            // 2: tf      "acceps up to 10 characters"
            // 3: send    "Send"
            // 4: reset   "Reset"
        frame.getContentPane().add(BorderLayout.NORTH, mb); 

        // Menubar 

        frame.getContentPane().add(BorderLayout.CENTER, ta); 
        // Text area

        frame.setVisible(true); 
        

        



     }
}