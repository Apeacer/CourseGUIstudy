import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
import java.util.*;

public class Tab3 extends JPanel{
	
	private JTextArea ta;
	private JScrollPane sp;
	private JButton b1,b2;
	
	public Tab3(){
		
		setLayout(new BorderLayout());
		setBackground(Color.yellow);
		
		ta= new JTextArea (20,20);                      // TextArea
		
		sp = new JScrollPane(ta);                       //ScrollPane
		sp.setPreferredSize(new Dimension(10,10));
		
		b1=new JButton("Save as...");                   //Button1 Save as
		b1.addActionListener(new b1Listener());
		
		b2=new JButton("Opten");                        //Button2 Opten
		b2.addActionListener(new b2Listener());
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.yellow);
		p1.setLayout(new BorderLayout());
		
		JPanel p2=new JPanel();
		p2.setBackground(Color.yellow);
		p2.setLayout(new GridLayout(3,1));
		p2.add(b1);
		p2.add(b2);
		p1.add(p2,BorderLayout.NORTH);
		
		add(sp,BorderLayout.CENTER);
		add(new Button2(),BorderLayout.NORTH);
		add(p1,BorderLayout.WEST);
		
	}
// Listener1------------------------------------------------------------	
	private class b1Listener implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
			
			FileNameExtensionFilter fn=new FileNameExtensionFilter("*.txt","txt");
			JFileChooser fc = new JFileChooser();
			fc.setFileFilter(fn);
			fc.setDialogTitle("另存为：");
			
		/*	
		 * 一种得到绝对路径的方法！
		 * String poistion=fc.getSelectedFile().getAbsolutePath();
		*/
			int text = fc.showSaveDialog(null);
			
			if(text==JFileChooser.APPROVE_OPTION){
			File f=fc.getSelectedFile().getAbsoluteFile();
			if (!f.getName().endsWith(".txt")) {
				f=new File(f.getPath()+".txt");}
			String s=ta.getText();
			
			BufferedWriter bw=null;
			FileWriter fw=null;
			
			try {
				
				
				fw=new FileWriter(f);
				bw=new BufferedWriter(fw);
				
				String info="";
				Scanner input=new Scanner(s);
				while(input.hasNextLine())
				{

					info=input.nextLine();
					bw.write(info+"\n\r\n");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally
			{
				
				try {
					bw.close();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
//			FileOutputStream fos=null;
//			
//			
//			
//			try{
//				
//				fos=new FileOutputStream(f);
//
//				fos.write(s.getBytes());
//				
//			
//			}catch(Exception e){
//				
//			}finally{
//				try {
//					fos.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}			
//			
			}
			else{
				JOptionPane.showMessageDialog(null,"You cheat me! ");
			}			
		}
		
		
	}
	
	
//Listener2-------------------------------------------------------------	
	private class b2Listener implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
			
			JFileChooser fc=new JFileChooser();
			fc.setDialogTitle("请选择打开的文件：");
			int text = fc.showOpenDialog(null);
			
			if(text!=JFileChooser.APPROVE_OPTION){
				
				ta.setText("Are you play me?");
			}
			else{
				
				File file= fc.getSelectedFile();
				try{
				     Scanner input=new Scanner(file);
				     String info="";
				     while(input.hasNext()){
					     info+=input.nextLine()+"\n";
					     ta.setText(info);
				     }
				
					}     
				catch(IOException exc){
					
					ta.setText("I don\'t know you");
				}
			}
				
		}
	}

}
