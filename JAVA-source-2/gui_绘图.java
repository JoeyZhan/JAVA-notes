import java.awt.*;
import java.awt.event.*;

public class Test_2
{
	public static void main(String[] args)
	{
		TF tf = new TF();
		tf.launch();
	}
}

class TF
{
	public void launch()
	{
		Frame f = new Frame();
		Button bt_1 = new Button("ÄÚÇÐÔ²");
		Button bt_2 = new Button("ÔÂÁÁ");
		f.setLayout(new GridLayout(1, 2));
		Panel p_1 = new Panel();
		Panel p_2 = new Panel();
		
		p_1.add(bt_1);
		p_2.add(bt_2);
		f.add(p_1);
		f.add(p_2);
		
		bt_1.addActionListener(new listener_1());
		bt_2.addActionListener(new listener_2());
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	class listener_1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			MyPaint_circle c = new MyPaint_circle();
			Frame f = new Frame();			
			f.add(c);
			f.setBounds(0, 200, 200, 200);
			f.setVisible(true);
		}
	}

	class listener_2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			MyPaint_moom m = new MyPaint_moom();
			Frame f = new Frame();			
			f.add(m);
			f.setBounds(300, 200, 200, 200);
			f.setVisible(true);
		}
	}

	class MyPaint_moom extends Panel
	{
		public void paint(Graphics g)
		{
			g.setColor(Color.yellow);
			g.fillOval(50, 50, 100, 100);
			g.setColor(Color.white);
			g.fillOval(35, 45, 100, 100);
		}
	}
	class MyPaint_circle extends Panel
	{
		public void paint(Graphics g)
		{
			g.setColor(Color.blue);
			g.fillOval(50, 50, 100, 100);
		}
	}
}