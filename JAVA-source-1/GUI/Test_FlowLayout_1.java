/*
	FlowLayout ���÷�_1
		
		Panel��Ĭ�Ϲ�����;
		
		FlowLayout���ֹ�������������ж�λ�����ڴ����ң�һ����������;
		
		���ı�����Ĵ�С�������ԭ�гߴ���ʾ����������ò�ͬ�������࣬�о��Լ����뷽ʽ;
		
		FlowLayout���ֹ����� Ĭ�϶��뷽ʽΪ ����;
		
		
		���÷���:
			new FlowLayout(FlowLayout.RIGHT, 20, 40);
				�Ҷ��룬���֮��ˮƽ��� 20 �����أ� ��ֱ��� 40 ������;
			
			new FlowLayout(FlowLayout.LEFT);
				����룬ˮƽ�ʹ�ֱ���Ϊȱʡֵ(5);
				
			new FlowLayout();
				ʹ��ȱʡ�ľ��ж��뷽����ˮƽ�ʹ�ֱ���Ϊȱʡֵ(5);
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