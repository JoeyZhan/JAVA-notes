/*
	Frame 的用法_1
	
		Frame 的常用方法
		
			public void setBounds(int x, int y, int width, int height)
				设置窗体位置与大小，x与y 表示窗体距离屏幕的水平和垂直距离,	width和height 表示窗体本身的 宽度和高度;
				
			public void setSize(int width, int height)
				设置窗体大小;
			
			public void setBackground(Color c)
				设置窗体的背景色;
				
			public void setVisible(boolean flag);
				设置窗体是否可见，true与false，默认为false;
*/

import java.awt.*;

public class Test_Frame_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("FRAME");		//设置Frame的显示名为 FRAME;	//在内存中产生了一个对象，要想在显示器显示，则必须得调用setVisible；
		Button bt = new Button("BUTTON");	//设置Button的显示名为 BUTTON;
		
		f.add(bt);							//组件bt 必须放在 容器f 里才能显示;
		//f.setSize(250, 250);				//设置窗体显示大小;
		//f.setLocation(300, 300);			//设置窗体显示位置;
		f.setBounds(300, 300, 250, 250);	//将上面两种设置集合在一起;
		f.setBackground(Color.RED);			//设置背景色;
		f.setVisible(true);					//设置窗体是否可见，默认为false;
	}
}