import javax.swing.*; 
import java.awt.*; 
public class finalGameGraphics extends JPanel{

    public void painComponent(Graphics g){
        super.paintComponent(g); 
        this.setBackground(Color.BLUE);
        

        JButton b1 = new JButton("Fuck"); 
        Graphics2D gd = (Graphics2D) g; 

        gd.setFont(new Font("AvantGarde", Font.BOLD,35)); 
        gd.drawString("Welcome to the impossible Tic-Tac-Toe",50,75); 

        gd.setFont(new Font("AvantGarde", Font.ITALIC,25)); 
        gd.drawString("Known for it's EXTREME difficulty",200,125); 

        gd.setFont(new Font("AvantGarde" ,Font.BOLD,35)); 
        gd.drawString("AI-19",350,175); 
       
        this.add(b1); 

    }

}