import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*; 

public class customlayout extends JFrame{
    
    public customlayout(String title)
    {
        super(title); 
        this.setSize(700,300); 
        this.setLocation(100,100); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JButton button1 = new JButton("Button 1"); 
        JButton button2 = new JButton("Button 2"); 
        JButton button3 = new JButton("Button 3"); 
        JButton button4 = new JButton("Button 4"); 
        JButton button5 = new JButton("Button 5"); 
        JButton button6 = new JButton("Button 6"); 
        JButton button7 = new JButton("Button 7"); 
        JButton button8 = new JButton("Button 8"); 
        JButton button9 = new JButton("Button 9"); 
        JButton button10 = new JButton("Button 10"); 
        JButton button11 = new JButton("Button 11");

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8,6)); 
        mainContainer.setBackground(Color.YELLOW);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.GREEN)); 

        //Panel Top 

        JPanel topPanel = new JPanel(); 
        topPanel.setBorder(new LineBorder(Color.BLACK,3));
        topPanel.setBackground(Color.ORANGE);
        topPanel.setLayout(new FlowLayout(5));
        mainContainer.add(topPanel, BorderLayout.NORTH); 

        topPanel.add(button1); 
        topPanel.add(button2); 
        topPanel.add(button3); 
        topPanel.add(button4); 

        mainContainer.add(topPanel,BorderLayout.NORTH); 

        //Panel middle 
        

        JPanel middlePanel = new JPanel();
        middlePanel.setBorder(new LineBorder(Color.BLACK,3));
        middlePanel.setLayout(new FlowLayout(4,4,4)); 
        middlePanel.setBackground(Color.CYAN); 

        JPanel gridPanel = new JPanel(); 
        gridPanel.setLayout(new GridLayout(4,1,5,5));
        gridPanel.setBorder(new LineBorder(Color.BLACK,3));
        gridPanel.setBackground(Color.RED); 

        gridPanel.add(button5); 
        gridPanel.add(button6); 
        gridPanel.add(button7); 
        gridPanel.add(button8); 

        JLabel label = new JLabel("Center Box", SwingConstants.CENTER);
        label.setOpaque(true); 
        label.setBorder(new LineBorder(Color.BLACK,3)); 

        middlePanel.add(gridPanel); 
        mainContainer.add(label); 
        mainContainer.add(middlePanel,BorderLayout.WEST); 

        JPanel bottomPanel = new JPanel(); 
        bottomPanel.setLayout(new FlowLayout(3)); 

        bottomPanel.add(button9); 
        bottomPanel.add(button10); 
        bottomPanel.add(button11);
        
        bottomPanel.setBackground(Color.MAGENTA); 
        bottomPanel.setBorder(new LineBorder(Color.BLUE,3)); 
        mainContainer.add(bottomPanel,BorderLayout.SOUTH); 


    }

    public static void main(String[] args){
        customlayout mylayout = new customlayout("MY Custom Layout"); 
        mylayout.setVisible(true); 
    }


}