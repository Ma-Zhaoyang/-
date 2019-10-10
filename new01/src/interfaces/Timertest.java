package interfaces;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Timertest {
  //回调程序示例
  
	public static void main(String[] args) {
	ActionListener listener=new TimePrinter();
	
	Timer t=new Timer(10000,listener);//实现回调操作
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
