package new01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class PictureTest {
public static void main(String[] args) {
	DrawComponent aComponent=new DrawComponent();
}
}

class DrawComponent extends JComponent{
	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT=400;//背景组成
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2=(Graphics2D) g;
		
		double leftX=100;
		double topY=100;
		double width=200;
		double height=150;
		
		Rectangle2D rect=new Rectangle2D.Double(leftX,topY,width,height);
		g2.setPaint(Color.RED);
		//g2.fill(rect);
		//颜色变换
		g2.draw(rect);
		//画矩形，参数为左上角位置坐标和图形的宽、高
	    /*double a=rect.getHeight();
	    System.out.println(a);*/
		//获取图形信息
		
		Ellipse2D ellipse=new Ellipse2D.Double();//画椭圆
		ellipse.setFrame(rect);//以矩形定位绘画
		g2.draw(ellipse);
		
		g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));//画直线
		
		double centerX=rect.getCenterX();//获取矩形中心
		double centerY=rect.getCenterY();
		double radius=150;//定义半径
		
		Ellipse2D circle=new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
		g2.draw(circle);
		//画圆
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}