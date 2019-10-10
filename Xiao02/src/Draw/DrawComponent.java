package Draw;

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
		
		Rectangle2D rect = new Rectangle2D.Double(leftX,topY,width,height);
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrame(100, 100, 150, 150);
		
		Color newcolorColor =new Color(FrameBuilder.r,FrameBuilder.g,FrameBuilder.b);
		
		g2.setPaint(newcolorColor);
		
		switch (FrameBuilder.s) {
		case 1:
			g2.draw(rect);
			break;
		case 2:
			g2.draw(circle);
		default:
			break;
		}
		
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
	}
}