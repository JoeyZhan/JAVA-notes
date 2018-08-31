/*
	GridLayout 的用法_1

		GridLayout布局管理器

		GridLayout型布局管理器将空间划分成规则的矩形网格，每个单元格区域大小相等;
		组件被添加到每个单元格中，先从左到右添满一行后换行，再从上到下;

		在GridLayout构造方法中指定分割的行数和列数：
			如：GridLayout(3,4);
			GridLayout是以行数为准的;
*/

import java.awt.*;

public class Test_GridLayout_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("GridLayout");
		Button bt_1 = new Button("Button_1");
		Button bt_2 = new Button("Button_2");
		Button bt_3 = new Button("Button_3");
		Button bt_4 = new Button("Button_4");
		Button bt_5 = new Button("Button_5");
		Button bt_6 = new Button("Button_6");
		Button bt_7 = new Button("Button_7");
		
		f.setLayout(new GridLayout(4, 2));
		f.add(bt_1);
		f.add(bt_2);
		f.add(bt_3);
		f.add(bt_4);
		f.add(bt_5);
		f.add(bt_6);
		f.add(bt_7);
		
		f.pack();				//调整此窗口的大小，以适合其子组件的首选大小和布局。
								//如果该窗口 和/或 其所有者仍不可显示，则两者在计算首选大小之前变得可显示。
		f.setVisible(true);
	}
}
