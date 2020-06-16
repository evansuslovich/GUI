import javax.swing.*; 
import java.awt.BorderLayout;


public class MyFrame extends JFrame{

    GraphicsDemo gd1 = new GraphicsDemo(); 

    public MyFrame(){
        this.setTitle("Tic-Tac-Toe"); 
        this.setSize(800,800); 
        this.setLayout(new BorderLayout()); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(gd1); 
    
        this.setVisible(true); 

    }
}