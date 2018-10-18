/*
	FlowLayout 的用法_1
		
		Panel类默认管理器;
		
		FlowLayout布局管理器对组件逐行定位，行内从左到右，一行排满后换行;
		
		不改变组件的大小，按组件原有尺寸显示组件，可设置不同的组件间距，行距以及对齐方式;
		
		FlowLayout布局管理器 默认对齐方式为 居中;
		
		
		常用方法:
			new FlowLayout(FlowLayout.RIGHT, 20, 40);
				右对齐，组件之间水平间距 20 个像素， 垂直间距 40 个像素;
			
			new FlowLayout(FlowLayout.LEFT);
				左对齐，水平和垂直间距为缺省值(5);
				
			new FlowLayout();
				使用缺省的居中对齐方法，水平和垂直间距为缺省值(5);
*/

import java.awt.*;

public class Test_FlowLayout_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("FlowLayout");
		Button bt_1 = new Button("OK");
		Button bt_2 = new Button("OPEN");
		Button bt_3 = new Button("CLOSE");
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.add(bt_1);
		f.add(bt_2);
		f.add(bt_3);
		f.setSize(300, 400);
		f.setVisible(true);
	}
}