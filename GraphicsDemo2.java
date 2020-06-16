
import javax.swing.*; 
import java.awt.*;
public class GraphicsDemo2 extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g); 
        this.setBackground(Color.BLUE);
        this.setLayout(new BorderLayout()); 
        Graphics2D gd2 = (Graphics2D) g;

        gd2.setColor(Color.PINK); 
        gd2.fillRect(50,50,300,300); 


        

        /**
         * 
       
        int[] xPoints = {50,100,150,200,250,300,350}; 
        int[] yPoints = {350,250,275,200,275,150,100}; 
        int nPoints = xPoints.length; 


        //g2d.setColor(Color.WHITE); 
        //g2d.setStroke(new BasicStroke(10));
        //g2d.drawLine(25,25,775,775);

        //g2d.setColor(Color.GREEN); 
        //g2d.setStroke(new BasicStroke(5)); 
        //g2d.drawPolyline(xPoints, yPoints, nPoints);

        //g2d.setFont(new Font("Comic Sans" ,Font.ITALIC,25)); 
        
        //g2d.drawString("STONKS",100,100); 
        int[] x = {100,200,300}; 
        int[] y = {300,127,300};

        g2d.setColor(Color.YELLOW); 
        g2d.fillPolygon(x,y,3);
         

        g2d.setColor(Color.PINK); 
        g2d.fillRect(50,50,300,300); 
        
        g2d.setColor(Color.blue); 
        g2d.drawOval(50,50,400,400); 

        g2d.setPaint(new Color(150,250,150)); 
        g2d.drawArc(50,50,300,300,0,90); 

        GradientPaint paint = new GradientPaint(0,0,Color.RED, 420, 0, Color.BLUE);
        g2d.setPaint(paint); 
        g2d.fillArc(0,0,800,800,0,360); 
        */

        











    }
}