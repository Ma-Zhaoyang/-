package Draw;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorMouseListener01 implements MouseListener{
	//��button�ļ�����������ʵ�ֵĹ���Ϊֱ�ӻ�������ɫ��ͼ
	//��ʵ�ֽ���ѡ�л�ͼ��ɫ
	
	private Button button;
	private Frame frame;
	 
	public ColorMouseListener01(Button button,Frame frame) {  
		//�������캯����ʹ���βθ��ֶ�button��ֵ
		super();
		this.button = button;
		this.frame=frame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//��굥�������¼�
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
