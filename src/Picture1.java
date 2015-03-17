import javax.swing.*;
import java.awt.*;

public class Picture1 extends JPanel
{
	private final int m =100; 
	private final int t =100;
	
	public Picture1 (){
		
		setBackground (Color.red);
		setPreferredSize (new Dimension(250,250));
		setFont (new Font ("",Font.BOLD,16));
	}
	

	public void paint (Graphics page){
		
		page.setColor(Color.yellow);
		page.drawLine (m,t,m-50,t-50);
		page.drawRect(m, t, 50, 50);
		
	}

}
