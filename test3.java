import javax.swing.*; 
import java.awt.event.*;
public class test3{

  
    public test3()
    {
        frame(); 
    }

    public void frame()
    {
        JFrame f = new JFrame(); 
        f.setSize(400,400); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        JButton b1 = new JButton("Action Listener"); 
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Acton Listener is woking");
            }
        });

        p.add(b1); 
        f.add(p);
        f.setVisible(true); 



    }

    public static void main(String[] args){
        new test3(); 
    }


}