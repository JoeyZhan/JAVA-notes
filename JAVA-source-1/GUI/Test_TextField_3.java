/*
	event 事件处理_4
	
	文本框加法运算举例_3
	
	TestField监听器
		TextField对象可能发生Action（光标在文本框内敲回车）事件, 与该事件对应的事件类是java.awt.event.ActionEVent;
		
		用来处理ActionEvent事件是实现了java.awt.event.ActionListener接口的类的对象,
		ActionListener接口定义有方法：
			public void actionPerformed(ActionEvente)
			
		实现该接口的类要在该方法中添加处理该事件（Action）的语句;
		
		使用 addActionListener(ActionListenerl）方法为 TextField对象 注册一个 ActionListener 对象，当TextField对象发生Action事件时，会生成一个
		ActionEvent对象，该对象作为参数传递给 ActionLIStener对象 的 actionPerformer 方法 在 方法中可以获取该对象的信息，并做相应的处理;
	
	内部类的用法(非重点)
		内部类
			定义：
				在A类的内部但是所有方法的外部定义了一个B类，则B类就是A类的内部类，A是B的外部类;
				
		可以把内部类当做包裹它的外部类的一个成员，这是理解内部类的关键;
		
		内部类的优点：
			内部类的所有方法都可以访问外部类的所有成员;
			增加程序的安全性，有效避免其他不相关类对该类的访问;
		
		何时使用
			如果一个B类要使用A类的所有成员，并且B类不需要被除A类以外的其他类访问，则我们应当把B类定义为A类的内部类;

*/

import java.awt.*;
import java.awt.event.*;

public class Test_TextField_3
{
	public static void main(String[] args)
	{
		TF tf = new TF();
		tf.launch();
	}
}

class TF
{
	private TextField tf_1, tf_2, tf_3;
	
	public void launch()
	{
		tf_1 = new TextField(20);
		tf_2 = new TextField(20);
		tf_3 = new TextField(20);
		Frame f = new Frame("Addition");
		f.setLayout(new FlowLayout());
		Button bt = new Button("=");
		Label lb = new Label("+");
		
		f.add(tf_1);
		f.add(lb);
		f.add(tf_2);
		f.add(bt);
		f.add(tf_3);
		
		f.addWindowListener(new MyMonitor());
		bt.addActionListener(new MyMonitor());
		
		f.pack();
		f.setVisible(true);
	}
	
	class MyMonitor extends WindowAdapter implements ActionListener		//内部类
	{
		public void actionPerformed(ActionEvent e)
		{
			String str_1 = tf_1.getText();
			String str_2 = tf_2.getText();
			int numb_1 = Integer.parseInt(str_1);
			int numb_2 = Integer.parseInt(str_2);
			int numb_3 = numb_1 + numb_2;
			tf_3.setText(numb_3 + "");
		}
		
		public void windowClosing(WindowEvent e)
		{
			System.exit(-1);
		}
	}
}