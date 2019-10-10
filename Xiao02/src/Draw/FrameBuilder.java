package Draw;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;

public class FrameBuilder {
	
	//���찴�����ڵ�frame���棬�����г������ʾ�ĵ�һ������
	
	private static final Color Color = null;
	public static int r=0;
	public static int g=0;
	public static int b=0;
	public static int s=0;
	
	public FrameBuilder() {
		JFrame frame =new JFrame("��ͼ������¼���");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//�Ƿ���ʾ
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);//���ھ���
		frame.setLayout(null);//��ղ���
		
		Button redbutton = new Button("red");
		redbutton.setBounds(100, 100, 100, 50);
		redbutton.setBackground(Color.red);
		//��ɫѡ�񰴼�
		
		Button greenbutton = new Button("green");
		greenbutton.setBounds(300, 100, 100, 50);
		greenbutton.setBackground(Color.green);
		//��ɫѡ�񰴼�
		
		Button bluebutton = new Button("blue");
		bluebutton.setBounds(500, 100, 100, 50);
		bluebutton.setBackground(Color.blue);
		//��ɫѡ�񰴼�
		
		Button rectbutton = new Button("Rect");
		rectbutton.setBounds(100, 200, 100, 50);
		
		Button circlebutton = new Button("Circle");
		circlebutton.setBounds(300, 200, 100, 50);
		
		ColorMouseListener colorMouseListener = new ColorMouseListener(redbutton, frame);
		//����һ���������¼�����
		redbutton.addMouseListener(colorMouseListener);
		//�Ժ�ɫbutton���м���
		ColorMouseListener01 colorMouseListener01 = new ColorMouseListener01(greenbutton, frame);
		greenbutton.addMouseListener(colorMouseListener01);
		//ʵ����ɫ��������
		ColorMouseListener02 colorMouseListener02 = new ColorMouseListener02(bluebutton, frame);
		bluebutton.addMouseListener(colorMouseListener02);
		//ʵ����ɫ��������
		//�̻�ͼ����ɫ
		
		
		ShapeMouseListener shapeMouseListener = new ShapeMouseListener(rectbutton, frame);
		rectbutton.addMouseListener(shapeMouseListener);
		//�̻�������״
		ShapeMouseListener01 shapeMouseListener01 = new ShapeMouseListener01(circlebutton, frame);
		circlebutton.addMouseListener(shapeMouseListener01);
		
		frame.add(redbutton);
		frame.add(greenbutton);
		frame.add(bluebutton);
		frame.add(rectbutton);
		frame.add(circlebutton);
	}
}
