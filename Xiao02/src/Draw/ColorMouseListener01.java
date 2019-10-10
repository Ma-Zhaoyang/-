package Draw;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorMouseListener01 implements MouseListener{
	//对button的监听器，现在实现的功能为直接画出带颜色的图
	//拟实现仅仅选中绘图颜色
	
	private Button button;
	private Frame frame;
	 
	public ColorMouseListener01(Button button,Frame frame) {  
		//创建构造函数，使用形参给字段button赋值
		super();
		this.button = button;
		this.frame=frame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//鼠标单击触发事件
		if(e.getClickCount()==1) {
		FrameBuilder.g=255;
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
