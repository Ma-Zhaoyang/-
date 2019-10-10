package Draw;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;

public class FrameBuilder {
	
	//构造按键所在的frame版面，即运行程序后显示的第一个界面
	
	private static final Color Color = null;
	public static int r=0;
	public static int g=0;
	public static int b=0;
	public static int s=0;
	
	public FrameBuilder() {
		JFrame frame =new JFrame("绘图（鼠标事件）");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//是否显示
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);//窗口居中
		frame.setLayout(null);//清空布局
		
		Button redbutton = new Button("red");
		redbutton.setBounds(100, 100, 100, 50);
		redbutton.setBackground(Color.red);
		//红色选择按键
		
		Button greenbutton = new Button("green");
		greenbutton.setBounds(300, 100, 100, 50);
		greenbutton.setBackground(Color.green);
		//绿色选择按键
		
		Button bluebutton = new Button("blue");
		bluebutton.setBounds(500, 100, 100, 50);
		bluebutton.setBackground(Color.blue);
		//蓝色选择按键
		
		Button rectbutton = new Button("Rect");
		rectbutton.setBounds(100, 200, 100, 50);
		
		Button circlebutton = new Button("Circle");
		circlebutton.setBounds(300, 200, 100, 50);
		
		ColorMouseListener colorMouseListener = new ColorMouseListener(redbutton, frame);
		//创建一个鼠标监听事件对象
		redbutton.addMouseListener(colorMouseListener);
		//对红色button进行监听
		ColorMouseListener01 colorMouseListener01 = new ColorMouseListener01(greenbutton, frame);
		greenbutton.addMouseListener(colorMouseListener01);
		//实现绿色按键监听
		ColorMouseListener02 colorMouseListener02 = new ColorMouseListener02(bluebutton, frame);
		bluebutton.addMouseListener(colorMouseListener02);
		//实现蓝色按键监听
		//刻画图形颜色
		
		
		ShapeMouseListener shapeMouseListener = new ShapeMouseListener(rectbutton, frame);
		rectbutton.addMouseListener(shapeMouseListener);
		//刻画矩形形状
		ShapeMouseListener01 shapeMouseListener01 = new ShapeMouseListener01(circlebutton, frame);
		circlebutton.addMouseListener(shapeMouseListener01);
		
		frame.add(redbutton);
		frame.add(greenbutton);
		frame.add(bluebutton);
		frame.add(rectbutton);
		frame.add(circlebutton);
	}
}
