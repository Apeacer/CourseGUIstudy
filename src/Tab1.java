import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tab1 extends JPanel {
	
	private JButton b1,b2,b3;
	private JLabel l1,l2,l3;
//	boolean a1=false,a2=false,a3=false;
	private JPanel p,p1;
	
	public Tab1()
	{
		setLayout (new BorderLayout());
		setBackground(Color.white);
		
		p = new JPanel();
		p1 = new JPanel();
		
		Color c1 = new Color(255,150,0);
		p.setBackground(Color.red);
		p.setPreferredSize(new Dimension (1000,480));
		p1.setBackground(c1);
		
		b1 = new JButton("Can you see me ~");
		b2 = new JButton("Can you see me again~");
		b3 = new JButton("Can you see me again again~");
		b1.addActionListener(new B1Listener());
		b2.addActionListener(new B2Listener());
		b3.addActionListener(new B3Listener());

		p.setLayout (new BorderLayout());
		
		l1 = new JLabel("That is frist ! ");
		l2 = new JLabel("It not easy !");
		l3 = new JLabel("But I like !");
		
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		
	
		p.add(l1,BorderLayout.NORTH);
		p.add(l2,BorderLayout.WEST);
		p.add(l3,BorderLayout.EAST);
		add(new Button1(),BorderLayout.SOUTH);
		p1.add(b1,BorderLayout.WEST);
		p1.add(b2,BorderLayout.CENTER);
		p1.add(b3,BorderLayout.EAST);
		p.add(p1,BorderLayout.SOUTH);

		add(p);
	
	}
	
	private class B1Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			l1.setVisible(true);
			l2.setVisible(false);
			l3.setVisible(false);
			p.repaint();
		}

	}
	private class B2Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			l1.setVisible(false);
			l2.setVisible(true);
			l3.setVisible(false);
			p.repaint();
		}

	}
	private class B3Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			l1.setVisible(false);
			l2.setVisible(false);
			l3.setVisible(true);
			p.repaint();
		}

	}

}
