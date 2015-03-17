import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tab4 extends JPanel{
	
	private ImageIcon map,up,down,right,left,zz;
	private int x,y;
	private final int size=40,width=300,height=300,jump=10;
	
	
	public Tab4(){
		
		JButton b1=new JButton(new ImageIcon("right1.gif"));
		b1.addActionListener(new bListener());
		setBackground(Color.green);
		
		add(b1);
	}
		
		private class bListener implements ActionListener{
			
			public void actionPerformed(ActionEvent event){
				
				
			}
		} 
		

}
