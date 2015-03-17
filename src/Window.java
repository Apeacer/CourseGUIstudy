
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.io.*;


public class Window {
	
	public static void main (String []args)
	{
		JFrame window = new JFrame ("That only a window ~ ");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

// Tab---------------------------------------------------------------------------------		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("Tab1", new Tab1());
		tab.addTab("Tab2", new Tab2());
		tab.addTab("Tab3", new Tab3());
		tab.addTab("Tab4", new Tab4());
		tab.addTab("Tab5", new Tab5());
		tab.addTab("Tab6", new Tab6());
				
		window.getContentPane().add(tab);

// Bar---------------------------------------------------------------------------------
		
		JMenuItem it1=new JMenuItem("Save");
		JMenuItem it2=new JMenuItem("EXIT");
		JMenuItem it3=new JMenuItem("Help me please !");
		JMenuItem it4=new JMenuItem("I'm a jokking");
		
		it2.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				System.exit(0);
			}
		});
		
		it3.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				
//---------------Listener!!!!!!!!
				
			}
		});
		
		JMenu menu1=new JMenu("Hello~(H)");
		JMenu menu2=new JMenu("Goodbye~(G)");
		JMenu menu3=new JMenu("Other(O)");//
		
		menu1.add(it1);
		menu1.add(menu3);
		menu1.addSeparator();
		menu1.add(it2);
		//Öú¼Ç·û
		menu1.setMnemonic('h');
		menu2.add(it3);
		menu3.add(it4);
		
        JMenuBar bar = new JMenuBar();
		bar.add(menu1);
		bar.add(menu2);
		
		
// Add---------------------------------------------------------------------------------	
		
		window.setJMenuBar(bar);
		
		window.setResizable(true);// set window size
		window.pack();
		window.setVisible(true);
	}


}
