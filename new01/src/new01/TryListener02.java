package new01;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class TryListener02 {
private static final Color Color = null;

public static void main(String[] args) {
	JFrame frame =new JFrame("��ͼ������¼���");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);//�Ƿ���ʾ
	frame.setSize(800, 800);
	frame.setLocationRelativeTo(null);//���ھ���
	frame.setLayout(null);//��ղ���
	
	Button yellowbutton = new Button("Draw");
	yellowbutton.setBounds(100, 100, 100, 50);
	yellowbutton.setBackground(Color.yellow);
	
	ColorMouseListener colorMouseListener = new ColorMouseListener(yellowbutton, frame);//����һ���������¼�����
	yellowbutton.addMouseListener(colorMouseListener);//���colorMouseListener�������¼�
	
	frame.add(yellowbutton);
  }
}

class ColorMouseListener implements MouseListener{
	private Button button;//������紫������button����
	private Frame frame;
	 
	public ColorMouseListener(Button button,Frame frame) {  //�������캬������ʹ���βθ��ֶ�button��ֵ
		super();
		this.button = button;
		this.frame=frame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//��굥�������¼�
		
		if(e.getClickCount()==1) {
		/*Button button=new Button("nice");
		button.setBounds(300, 300, 50, 50);
		button.setBackground(Color.red);
		frame.add(button);*/
		//ͨ������������һ��Button
		
		//button.setBackground(Color.blue)
		//ͨ�������ı�button��ɫ
		
		JFrame frame=new DrawFrame();
		frame.setTitle("2DTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class DrawFrame extends JFrame{
	public DrawFrame() {
	add(new DrawComponent());
	pack();
	}
}

class DrawComponent extends JComponent{
	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT=400;//�������
	
	public void DrawComponent(Graphics g)
	{
		Graphics2D g2=(Graphics2D) g;
		
		double leftX=100;
		double topY=100;
		double width=200;
		double height=150;
		
		Rectangle2D rect=new Rectangle2D.Double(leftX,topY,width,height);
		//g2.setPaint(Color.RED);
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