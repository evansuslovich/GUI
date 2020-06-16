/**
 * Panel: It is a pure container and is not a window in 
 * itself. The sole purpose of a Panel is to organize 
 * the components on to a window.
 * 
 * Frame: It is a fully functioning window with 
 * its title and icons 
 * 
 * Dialog: Dialog: It can be thought of like a pop-up window
 *  that pops out when a message has to be displayed.
 * It is not a fully functioning window like the Frame.
 */
import javax.swing.*; 
 public class Swing{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("My first GUI"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JButton button1 = new JButton("This is Button 1"); 
        frame.getContentPane().add(button1); // Adds button to content pane of frame 
    
        JButton button2 = new JButton("This is Button 2"); 
        frame.getContentPane().add(button2); 

        frame.setVisible(true); 

        // the problem is that the two buttons are 
        // overlapping over one another 
        // Java Layout Manager 
        
        // Java BorderLayout
            // top, left, right, bottom, center 

        // Java FlowLayout 
            // The defalut layout manager for every 
            // JPanel. It simply lays out compenents in 
            // a single row one after the other

        //Java GridBagLayout 
            //The most sophisticated layout. It alligns 
            // components by placing them wihthin a grid
            //of cells, allowing to span more than one cell 

        




    }
 }