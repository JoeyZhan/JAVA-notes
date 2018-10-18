/*
	BorderLayout 的用法_1
	
		Frame类的默认布局管理器;
		
		BorderLayout将整个容器的布局划分成
			命东（EAST)
			令西（WEST)
			命南（SOUTH)
			命北（NORTH)
			令中（CENTER)	五个区域，组件只能被添加到指定的区域;
			
		如不指定组件的加入部位，则默认加入到CENTER区;
		每个区域只能加入一个组件，如加入多个，则先前加入的会被覆盖;
*/

import java.awt.*;

public class Test_BorderLayout_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("BorderLayout");
		Button bt_1 = new Button("NORTH");
		Button bt_2 = new Button("SOUTH");
		Button bt_3 = new Button("WEST");
		Button bt_4 = new Button("EAST");
		Button bt_5 = new Button("CENTER");
		
		f.add(bt_1, BorderLayout.NORTH);
		f.add(bt_2, BorderLayout.SOUTH);
		f.add(bt_3, BorderLayout.WEST);
		f.add(bt_4, BorderLayout.EAST);
		f.add(bt_5, BorderLayout.CENTER);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
}