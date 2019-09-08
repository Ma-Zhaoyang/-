package new01;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 * MouseListener：鼠标监听事件
 * 给窗口添加一个按钮，
 * @author Administrator
 */
public class MouseListenerDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("窗口程序");//创建一个带标题的窗口对象frame
		frame.setVisible(true);//显示窗口
		frame.setSize(600, 400);//设置窗口大小
		frame.setLocationRelativeTo(null);//设置窗口居中
		frame.setDefaultCloseOperation(3);//点击X关闭程序  3为结束程序	
		frame.setLayout(null);//清空布局
		
		Button button = new Button("按钮");
		button.setBounds(100,100,100,50);
		button.setBackground(Color.ORANGE);
		
		MyMouseListener myMouseListener = new MyMouseListener(button);//创建一个鼠标监听事件对象
		button.addMouseListener(myMouseListener);//添加myMouseListener鼠标监听事件
		frame.add(button);
	}
 
}
class MyMouseListener implements MouseListener{
 
	private Button button;//接收外界传进来的button对象
 
	public MyMouseListener(Button button) {  //使用形参给字段button赋值
		super();
		this.button = button;
	}
	
	/*
	 * 每次点击组件时，自动调用此方法
	 */
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * 退出程序
		 */
		//System.exit(0);//强制退出虚拟机
		//判断是否双击：   e.getClickCount()获取点击次数
		if (e.getClickCount() == 2) {
			System.exit(0);
		}
	}
 
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
 
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
 
	/*
	 * 当鼠标移动到组件上时，自动调用此方法
	 */
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = button.getX();//获取按钮当前的横坐标值
		int y = button.getY();//获取按钮当前的纵坐标值
		int width = button.getWidth();//获取按钮当前的宽
		int height = button.getHeight();//获取按钮当前的高
		button.setBounds(x,y,width+50,height+50);
	}
 
	/*
	 * 当鼠标离开组件上时，自动调用此方法
	 */
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = button.getX();//获取按钮当前的横坐标值
		int y = button.getY();//获取按钮当前的纵坐标值
		int width = button.getWidth();//获取按钮当前的宽
		int height = button.getHeight();//获取按钮当前的高
		button.setBounds(x,y,width-50,height-50);
	}
	
}
