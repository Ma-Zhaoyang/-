package Draw01;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;

public class FrameBuilder {
	
	//���찴�����ڵ�frame���棬�����г������ʾ�ĵ�һ������
	
	private static final Color Color = null;
	public static int r=0;
	public static int g=0;
	public static int b=0;
	
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
		
		Button rectbutton = new Button("Rect");
		rectbutton.setBounds(100, 200, 100, 50);
		
		ColorMouseListener colorMouseListener = new ColorMouseListener(redbutton, frame);
		//����һ���������¼�����
		redbutton.addMouseListener(colorMouseListener);
		//��button���м���
		//�̻�ͼ����ɫ
		
		ShapeMouseListener shapeMouseListener = new ShapeMouseListener(rectbutton, frame);
		rectbutton.addMouseListener(shapeMouseListener);
		//�̻�ͼ����״
		
		frame.add(redbutton);
		frame.add(rectbutton);
	}
}
