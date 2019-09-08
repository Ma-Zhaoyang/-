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
	private static final int DEFAULT_HEIGHT=400;//�������
	
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
		//��ɫ�任
		g2.draw(rect);
		//�����Σ�����Ϊ���Ͻ�λ�������ͼ�εĿ���
	    /*double a=rect.getHeight();
	    System.out.println(a);*/
		//��ȡͼ����Ϣ
		
		Ellipse2D ellipse=new Ellipse2D.Double();//����Բ
		ellipse.setFrame(rect);//�Ծ��ζ�λ�滭
		g2.draw(ellipse);
		
		g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));//��ֱ��
		
		double centerX=rect.getCenterX();//��ȡ��������
		double centerY=rect.getCenterY();
		double radius=150;//����뾶
		
		Ellipse2D circle=new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
		g2.draw(circle);
		//��Բ
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}