package new01;

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;

public class TryListener{
	public static void main(String[] args) {
	JFrame aButtonFrame=new ButtonFrame();
	}
}
class ButtonFrame extends JFrame{
	
	  private JPanel buttonPanel;
	  private static final int DEFAULT_WIDTH=300;
	  private static final int DEFAULT_HEIGT=200;
	  
	  public void ButtonFrame() {
		  setSize(DEFAULT_WIDTH,DEFAULT_HEIGT);
		  
		  JButton yellowButton=new JButton("Tellow");
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
	  
	  public class ColorAction implements ActionListener{
		  private Color backgroundColor;
		  
		  public ColorAction(Color c) {
			  backgroundColor=c;
		  }
		  
		  public void actionPerformed(ActionEvent event) {
			  buttonPanel.setBackground(backgroundColor);
		  }
	   }
	 }


