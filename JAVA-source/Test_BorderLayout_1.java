/*
	BorderLayout ���÷�_1
	
		Frame���Ĭ�ϲ��ֹ�����;
		
		BorderLayout�����������Ĳ��ֻ��ֳ�
			������EAST)
			������WEST)
			���ϣ�SOUTH)
			������NORTH)
			���У�CENTER)	����������ֻ�ܱ���ӵ�ָ��������;
			
		�粻ָ������ļ��벿λ����Ĭ�ϼ��뵽CENTER��;
		ÿ������ֻ�ܼ���һ��������������������ǰ����Ļᱻ����;
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