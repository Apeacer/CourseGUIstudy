import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button2 extends JPanel{
	
	private JButton button;
	private String talk5;
	private int talk6=0;
	
	public Button2()
	{
		button = new JButton("Come on babby ~");
		button.addActionListener(new Button2Listener());
		add(button);
	}
	
	private class Button2Listener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			do{
				int talk1= JOptionPane.showConfirmDialog(null,"Click \"yes\",you will found"+
			                                             " everything you want !");
				if(talk1==JOptionPane.YES_OPTION){
					int talk2= JOptionPane.showConfirmDialog(null, "OK, I cheat you..."+
				                                              "\nDo you want killing me?~");
					if(talk2==JOptionPane.YES_OPTION){
						int talk3=JOptionPane.showConfirmDialog(null,"Are you joking? "+"" +
								                             "\nDon't fight me please~");
						talk5=JOptionPane.showInputDialog("OK,Enter the money you want~");
					}//-----------------------------
					else{
						int talk4=JOptionPane.showConfirmDialog(null, "Oh~ You are so kind! ");
						JOptionPane.showMessageDialog(null,"I must thank you!");
						talk5=JOptionPane.showInputDialog("OK,Enter the money you want~");
					}
					}
					else{
						JOptionPane.showMessageDialog(null,"OK,You are good boy...");
					}
				JOptionPane.showMessageDialog(null,"Then, I know you want "+talk5+"\nYou can go away~");
				talk6=JOptionPane.showConfirmDialog(null,"Again?");
				}while(talk6==JOptionPane.YES_OPTION);//--------------------------------
			}//-------------------------
		}
	}


