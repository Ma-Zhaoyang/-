package new01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TryListener01 {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			JFrame frame=new DrawFrame();
			frame.setTitle("ListenerTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class DrawFrame extends JFrame{
	public DrawFrame() {
	add(new ButtonFrame());
	pack();
	}
}
class ButtonFrame extends JFrame{
	
	  private JPanel buttonPanel;
	  private static final int DEFAULT_WIDTH=300;
	  private static final int DEFAULT_HEIGT=200;
	  
	  public ButtonFrame() {
		  setSize(DEFAULT_WIDTH,DEFAULT_HEIGT);
		  
		  JButton yellowButton=new JButton("Yellow");
		  JButton blueButton=new JButton("Blue");
		  JButton redButton=new JButton("Red");
		  
		  buttonPanel=new JPanel();
		  
		  buttonPanel.add(yellowButton);
		  buttonPanel.add(blueButton);
		  buttonPanel.add(redButton);
		  
		  add(buttonPanel);
		  
		  ColorAction yellowAction=new ColorAction(Color.yellow);
		  ColorAction blueAction=new ColorAction(Color.blue);
		  ColorAction redAction=new ColorAction(Color.red);
		  
		  yellowButton.addActionListener(yellowAction);
		  blueButton.addActionListener(blueAction);
		  redButton.addActionListener(redAction);
	  }
	  
	  private class ColorAction implements ActionListener{
		  private Color backgroundColor;
		  
		  public ColorAction(Color c) {
			  backgroundColor=c;
		  }
		  
		  public void actionPerformed(ActionEvent event) {
			  buttonPanel.setBackground(backgroundColor);
		  }
	   }
	 }


