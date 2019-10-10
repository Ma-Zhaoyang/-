package Draw01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class DrawComponent extends JComponent{
	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT=400;//背景组成
	
	public void paintComponent(Graphics g)
	{
		//所绘制图形的参数设定
		
		Graphics2D g2=(Graphics2D) g;
		
		double leftX=100;
		double topY=100;
		double width=200;
		double height=150;
		
		Rectangle2D rect=new Rectangle2D.Double(leftX,topY,width,height);
		
		Color newcolorColor =new Color(FrameBuilder.r,0,0);
		
		g2.setPaint(newcolorColor);
		g2.draw(rect);
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
	}
}