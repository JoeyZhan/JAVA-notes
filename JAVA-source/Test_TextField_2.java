/*
	event 事件处理_3
	
	文本框加法运算举例_2
		通过在B类中定义A类的属性，就可以达到在B类访问A类成员的目的,
		但是通过这种方式无法访问A类私有成员;
		
		本方式既繁琐又有局限性，不推荐;
*/

import java.awt.*;
import java.awt.event.*;

public class Test_TextField_2
{
	public static void main(String[] args)
	{
		TF tf = new TF();
		tf.launch();
	}
}

class TF
{
	public TextField tf_1, tf_2, tf_3;
	
	public void launch()
	{
		tf_1 = new TextField(30);
		tf_2 = new TextField(30);
		tf_3 = new TextField(30);
		Button bt = new Button("=");
		Label lb = new Label("+");
		
		Frame f = new Frame("Addition");
		f.setLayout(new FlowLayout());
		
		f.add(tf_1);
		f.add(lb);
		f.add(tf_2);
		f.add(bt);
		f.add(tf_3);
		
		f.addWindowListener(new MyMonitor());
		bt.addActionListener(new MyMonitor(this));		
		
		f.pack();
		f.setVisible(true);
	}
}

class MyMonitor extends WindowAdapter implements ActionListener
{
	private TF tf;
	
	public MyMonitor(){
	}
	
	public MyMonitor(TF tf)
	{
		this.tf = tf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String str_1 = tf.tf_1.getText();
		String str_2 = tf.tf_2.getText();
		int numb_1 = Integer.parseInt(str_1);
		int numb_2 = Integer.parseInt(str_2);
		int numb_3 = numb_1 + numb_2;
		
		tf.tf_3.setText(numb_3 + "");
	}
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(-1);
	}
}