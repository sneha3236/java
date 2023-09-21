import java.awt.*;
import java.awt.event.*;

class MyEvents implements ActionListener
{
	Frame f;
	Button b;

	MyEvents()
	{
	f=new Frame();
	b=new Button();
	b.addActionListener(this);
	f.add(b);
	f.setVisible(true);
	f.setSize(400,400);
	}

	public static void main(String ar[])
	{
	MyEvents e=new MyEvents();
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Good Night");
	}
}