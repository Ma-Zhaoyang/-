package new01;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 * MouseListener���������¼�
 * ���������һ����ť��
 * @author Administrator
 */
public class MouseListenerDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("���ڳ���");//����һ��������Ĵ��ڶ���frame
		frame.setVisible(true);//��ʾ����
		frame.setSize(600, 400);//���ô��ڴ�С
		frame.setLocationRelativeTo(null);//���ô��ھ���
		frame.setDefaultCloseOperation(3);//���X�رճ���  3Ϊ��������	
		frame.setLayout(null);//��ղ���
		
		Button button = new Button("��ť");
		button.setBounds(100,100,100,50);
		button.setBackground(Color.ORANGE);
		
		MyMouseListener myMouseListener = new MyMouseListener(button);//����һ���������¼�����
		button.addMouseListener(myMouseListener);//���myMouseListener�������¼�
		frame.add(button);
	}
 
}
class MyMouseListener implements MouseListener{
 
	private Button button;//������紫������button����
 
	public MyMouseListener(Button button) {  //ʹ���βθ��ֶ�button��ֵ
		super();
		this.button = button;
	}
	
	/*
	 * ÿ�ε�����ʱ���Զ����ô˷���
	 */
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * �˳�����
		 */
		//System.exit(0);//ǿ���˳������
		//�ж��Ƿ�˫����   e.getClickCount()��ȡ�������
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
	 * ������ƶ��������ʱ���Զ����ô˷���
	 */
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = button.getX();//��ȡ��ť��ǰ�ĺ�����ֵ
		int y = button.getY();//��ȡ��ť��ǰ��������ֵ
		int width = button.getWidth();//��ȡ��ť��ǰ�Ŀ�
		int height = button.getHeight();//��ȡ��ť��ǰ�ĸ�
		button.setBounds(x,y,width+50,height+50);
	}
 
	/*
	 * ������뿪�����ʱ���Զ����ô˷���
	 */
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = button.getX();//��ȡ��ť��ǰ�ĺ�����ֵ
		int y = button.getY();//��ȡ��ť��ǰ��������ֵ
		int width = button.getWidth();//��ȡ��ť��ǰ�Ŀ�
		int height = button.getHeight();//��ȡ��ť��ǰ�ĸ�
		button.setBounds(x,y,width-50,height-50);
	}
	
}
