package Draw;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class PictureBuild {
	
	//���컭ͼ��չʾ��ͼ�ν��棬����ʵ�ֻ���ͼ�εĹ��ܣ�������ѡ����ɫ
	
	public PictureBuild(){
		EventQueue.invokeLater(()->{
			DrawFrame frame01=new DrawFrame();
			frame01.setTitle("2DTest");
			frame01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame01.setVisible(true);
		});
	}
	
}

class DrawFrame extends JFrame{
	public DrawFrame() {
		add(new DrawComponent());
		pack();
		}
}