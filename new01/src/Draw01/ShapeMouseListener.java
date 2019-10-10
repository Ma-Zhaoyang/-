package Draw01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.MenuDragMouseListener;

public class ShapeMouseListener implements MouseListener{
    //实现对图形的绘制
	
	private Button button;
	private Frame frame;
	
	public ShapeMouseListener(Button button,Frame frame) {
		super();
		this.button = button;
		this.frame=frame;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount()==1) {
			PictureBuild frame=new PictureBuild();
	}
}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
