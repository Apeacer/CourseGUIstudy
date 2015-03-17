import java.awt.Dimension;

import javax.swing.JFrame;


public class CarRun{
	
	public static void main(String[] arg)
	{
		JFrame f1=new JFrame("Car~");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		f1.setPreferredSize(new Dimension(600,400));
		f1.getContentPane().add(new CarRunCode());
		
		f1.pack();
		f1.setVisible(true);
	}

}
