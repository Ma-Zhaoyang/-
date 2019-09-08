package new01;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Graph {
public static void main(String[] args) {
	EventQueue.invokeLater(()->
	{
		SimpleFrame frame=new SimpleFrame();
		frame.setTitle("newTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	});
}
}

class SimpleFrame extends JFrame{
	private static final int DEFAUL_WIDTH=300;
	private static final int DEFAULT_HIGHT=200;
	JButton yellowButton=new JButton("Yellow");
	
	public SimpleFrame() {
		setSize(DEFAUL_WIDTH,DEFAULT_HIGHT);
	}
}
