/*
	event 事件处理_1
	
	事件(Event)
		用户对组件的一个操作，称之为一个事件;

	事件源(EventSource)
		能够产生事件的GUI组件对象，如按钮、文本框等;

	事件处理方法(EventHandler)
		能够接收、解析和处理事件类对象，实现与用户交互功能的方法;

	事件监听器(EventListener)
		可以处理事件的一个类;
		
	
	事件处理相关概念
		默认情况下事件源不会自动产生任何事件，程序员需要做两件事：
			1.告诉事件源可以自动产生哪类事件，即：向事件源注册某种事件的事件监听器对象;
		
			2.设计好可以处理这种事件的事件监听器;
			
		一旦完成了这两步操作，当用户对事件源进行操作时，事件源就会自动产生事件，事件源就会自动把产生的事件封装成
		一个事件对象，事件源就会自动把封装好的事件对象传递给事件监听器;

		事件监听器收到事件源发送过来的事件时，事件监听器就会自动调用相应的事件处理方法来对该事件进行相应的处理;
	
	
	事件处理步骤

		假设事件为XXXX;

		1.向事件源注册某种事件的事件监听器对象;
			addXXXXListener

		2.设计好可以处理这种事件的事件监听器;
			class 类名 implements XXXXListener
			{
				重写XXXXListener接口中的方法
			}

		说明
			要想设计出能够处理XXXX事件的监听器，只需要编写出实现了XXXXListener接口的类就0K了，
		因为XXXXListener接口中已经定义了可以处理XXXX事件的方法;
	
	问题
		事件有哪些？
			java.awt.event包中含有所有的事件，
			常用的事件有：
				ActionEvent：激活组件时发生的事件
				KeyEvent：操作键盘时发生
				MouseEvent：操作鼠标时发生
				WindowEvent：操作窗口时发生的事件，如最大化或最小化某一窗口。
				
		一个事件源可以自动产生哪些事件？
				第三方软件会自动显示，不需要认为认为记忆！
*/

import java.awt.*;
import java.awt.event.*;

public class Test_event_Button_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("event");
		Button bt_1 = new Button("Hi!");
		f.add(bt_1);
		
		//AL a = new AL();
		//WB b = new WB();
		bt_1.addActionListener(new AL());
		f.addWindowListener(new WB()); 
		
		f.pack();
		f.setVisible(true);
	} 
}

class WB extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(-1);
	}
}

class AL implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hello world!!!");
	}
}