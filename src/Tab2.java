import java.awt.*;
import javax.swing.*;

public class Tab2 extends JPanel{

	public Tab2()
	{
		setLayout (new BorderLayout());
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		
		Color c1 = new Color(150,150,255);
		
		p.setBackground(Color.blue);
		p1.setBackground(c1);
		
		p.setPreferredSize(new Dimension (1000,500));
		
		p.setLayout (new BorderLayout());
		p1.setLayout(new BorderLayout());
		
		
		JLabel l1 = new JLabel("That is scond ! ");
		JLabel l3 = new JLabel("Look! Totaly subway map ! "); 
		
		ImageIcon sub = new ImageIcon("sub.jpg");
		JLabel l2 = new JLabel (sub);
		l2.setHorizontalTextPosition(SwingConstants.CENTER);//Ë®Æ½
		l2.setVerticalTextPosition(SwingConstants.NORTH);//´¹Ö±
		
		ImageIcon sub2 = new ImageIcon("sub2.jpg");
		JLabel l4=new JLabel (sub2);
		
		JScrollPane sp = new JScrollPane(l2);
		sp.setPreferredSize(new Dimension (1000,450));
		
		p1.add(l1,BorderLayout.NORTH);
		p1.add(l3,BorderLayout.SOUTH);
		p.add(p1,BorderLayout.NORTH);
		p.add(sp,BorderLayout.WEST);
		p.add(l4,BorderLayout.EAST);
		add(p);
	}
}
