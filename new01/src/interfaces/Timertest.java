package interfaces;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Timertest {
  //�ص�����ʾ��
  
	public static void main(String[] args) {
	ActionListener listener=new TimePrinter();
	
	Timer t=new Timer(10000,listener);//ʵ�ֻص�����
	t.start();
	
	JOptionPane.showMessageDialog(null, "Quit program?");
	System.exit(0);	
	}
}

class TimePrinter implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		System.out.println("i:"+new Date());
		Toolkit.getDefaultToolkit().beep();
	}
	
}
