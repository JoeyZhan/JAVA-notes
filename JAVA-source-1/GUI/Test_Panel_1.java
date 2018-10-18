/*
	Panel 的用法_1
	
		Panel 是个容器，但不能单独存在，必须得被添加到其他容器中;
		
		Panel 构造方法:
			Panel() 
				使用默认的 FlowLayout 类布局管理器初始化;
				
			Panel(LayoutManager layout) 
				使用指定的布局管理器初始化;
*/

import java.awt.*;

public class Test_Panel_1
{
	public static void main(String[] args)
	{
		Panel p = new Panel();
		Frame f = new Frame("Frame with Panel");
		
		p.setBounds(300/2, 300/2, 500/2, 500/2);
		p.setBackground(new Color(204, 204, 255));
		f.setLayout(null);
		f.setBounds(300, 300, 500, 500);
		f.setBackground(new Color(100, 100, 102));
		
		f.add(p);				//Panel无法单独存在显示，必须被添加到其他容器中才能显示;
		f.setVisible(true);
	}
}