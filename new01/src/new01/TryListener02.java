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
	JFrame frame =new JFrame("绘图（鼠标事件）");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);//是否显示
	frame.setSize(800, 800);
	frame.setLocationRelativeTo(null);//窗口居中
	frame.setLayout(null);//清空布局
	
	Button yellowbutton = new Button("Draw");
	yellowbutton.setBounds(100, 100, 100, 50);
	yellowbutton.setBackground(Color.yellow);
	
	ColorMouseListener colorMouseListener = new ColorMouseListener(yellowbutton, frame);//创建一个鼠标监听事件对象
	yellowbutton.addMouseListener(colorMouseListener);//添加colorMouseListener鼠标监听事件
	
	frame.add(yellowbutton);
  }
}

class ColorMouseListener implements MouseListener{
	private Button button;//接收外界传进来的button对象
	private Frame frame;
	 
	public ColorMouseListener(Button button,Frame frame) {  //创建构造含函数，使用形参给字段button赋值
		super();
		this.button = button;
		this.frame=frame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//鼠标单击触发事件
		
		if(e.getClickCount()==1) {
		/*Button button=new Button("nice");
		button.setBounds(300, 300, 50, 50);
		button.setBackground(Color.red);
		frame.add(button);*/
		//通过监听创建另一个Button
		
		//button.setBackground(Color.blue)
		//通过监听改变button颜色
		
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
	private static final int DEFAULT_HEIGHT=400;//背景组成
	
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