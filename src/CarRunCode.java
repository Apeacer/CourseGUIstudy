import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.*;



public class CarRunCode extends JPanel {
	
	private ImageIcon map,up,down,right,left,zz;
	private int x,y;
	private final int size=40,width=600,height=400,jump=10;
	private int z1,z2;
	
	
	public CarRunCode(){
		
		x=width/2;
		y=height/2;
		
		addKeyListener(new KListener());
	
		map=new ImageIcon("map.jpg");
		up = new ImageIcon("up1.gif");
		down= new ImageIcon("down1.gif");
		right= new ImageIcon("right1.gif");
		left= new ImageIcon("left1.gif");
		zz=up;
		
		addMouseListener(new MListener());
		
		Random r1 = new Random();
		z1=r1.nextInt(599)+1;
		z2=r1.nextInt(399)+1;
		
		setPreferredSize(new Dimension(width+114,height+114));
		setFocusable(true);
		
		}
	
	
	public void paintComponent (Graphics page)
	{
		super.paintComponent(page);
		zz.paintIcon(this, page, x, y);
		setBackground(Color.white);
		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/logo.gif"));
		page.drawImage(im, 0, 0, 300, 150,this);
		
		page.setColor(Color.red);
		page.setFont(new Font("ººÒÇÍÞÍÞ×­¼ò",Font.BOLD,50));
		page.drawString("µãÎÒ°¡~", z1, z2);
		
	}
	
//KEY---------------------------------------------------------------------------------------------------
	private class KListener implements KeyListener{
		
		public void keyPressed (KeyEvent event){
			
			switch(event.getKeyCode()){
			
			case KeyEvent.VK_UP:// up----------
				if(y==0)
					{zz=up; break;}
				if(x<300&&y==150)
				    {zz=up; break;}
				zz=up;
				y-=jump;
				break;
			case KeyEvent.VK_W:
				if(y==0)
				{zz=up; break;}
			if(x<300&&y==150)
			    {zz=up; break;}
				zz=up;
				y-=jump;
				break;	
				
			case KeyEvent.VK_DOWN://down-------
				if(y==height)
				{zz=down; break;}
				zz=down;
				y+=jump;
				break;	
			case KeyEvent.VK_S:
				if(y==height)
				{zz=down; break;}
				zz=down;
				y+=jump;
				break;	
				
			case KeyEvent.VK_RIGHT:// right-----------
				if(x==width)
				{zz=right; break;}
				zz=right;
				x+=jump;
				break;	
			case KeyEvent.VK_D:
				if(x==width)
				{zz=right; break;}
				zz=right;
				x+=jump;
				break;	
				
			case KeyEvent.VK_LEFT://left--------
				if(x==0)
				{zz=left; break;}
				if(y<150&&x==300)
				{zz=left; break;}
				zz=left;
				x-=jump;
				break;			
			case KeyEvent.VK_A:
				if(x==0)
				{zz=left; break;}
				if(y<150&&x==300)
				{zz=left; break;}
				zz=left;
				x-=jump;
				break;				
			}
			repaint();
		}

		public void keyTyped(KeyEvent event) {}
		public void keyReleased(KeyEvent event){}
	}

	//MOUSE------------------------------------------------------------------------------------------
	private class MListener implements MouseListener{
		
		public void mouseEntered(MouseEvent event){
			
//			MouseEve
			Random r2=new Random();
			z1=r2.nextInt(599)+1;
			z2=r2.nextInt(399)+1;
			repaint();
			
			
			
		}
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}

}
