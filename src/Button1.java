import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button1 extends JPanel {
	
	private int count = 0;
	private JButton button;
	private JLabel lab;
	
	public Button1()
	{
		
		
		button = new JButton("Don't touch me ! ");
		button.addActionListener(new Button1Listener());
		setBackground(Color.yellow);
		
		lab = new JLabel("You are bad man x"+count);
		
		add(button);
		add(lab);
	}
	
	private class Button1Listener implements ActionListener
	{

	public void actionPerformed(ActionEvent event) {
		count++;
		lab.setText("You are bad man x"+count);
	}
	}

}
