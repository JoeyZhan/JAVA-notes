/*
	GridLayout ���÷�_1

		GridLayout���ֹ�����

		GridLayout�Ͳ��ֹ��������ռ仮�ֳɹ���ľ�������ÿ����Ԫ�������С���;
		�������ӵ�ÿ����Ԫ���У��ȴ���������һ�к��У��ٴ��ϵ���;

		��GridLayout���췽����ָ���ָ��������������
			�磺GridLayout(3,4);
			GridLayout��������Ϊ׼��;
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
		
		f.pack();				//�����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ��֡�
								//����ô��� ��/�� ���������Բ�����ʾ���������ڼ�����ѡ��С֮ǰ��ÿ���ʾ��
		f.setVisible(true);
	}
}
