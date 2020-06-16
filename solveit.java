// java Program to create a simple JWindow 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 


class solveit extends JFrame implements ActionListener { 

	// frame 
	static JFrame f; 

	// main class 
	public static void main(String[] args) 
	{ 
		// create a new frame 
		f = new JFrame("frame"); 

		// create a object 
		solveit s = new solveit(); 

		// create a panel 
		JPanel p = new JPanel(); 

		JButton b = new JButton("click"); 

		// add actionlistener to button 
		b.addActionListener(s); 

		// add button to panel 
		p.add(b); 

		f.add(p); 

		// set the size of frame 
		f.setSize(400, 400); 
		f.show(); 
		

	} 

	// if button is pressed 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 
		if (s.equals("click")) { 
			// create a window 
			JWindow w = new JWindow(f); 

			// set panel 
			JPanel p = new JPanel(); 

			// create a label 
			JLabel l = new JLabel("this is a window"); 

			// set border 
			p.setBorder(BorderFactory.createLineBorder(Color.black)); 

			p.add(l); 
			w.add(p); 

			// set background 
			p.setBackground(Color.red); 

			// setsize of window 
			w.setSize(200, 100); 

			// set visibility of window 
			w.setVisible(true); 

			// set location of window 
			w.setLocation(100, 100); 
		
		} 
	} 
} 
