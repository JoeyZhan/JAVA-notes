/*
	Panel ���÷�_1
	
		Panel �Ǹ������������ܵ������ڣ�����ñ���ӵ�����������;
		
		Panel ���췽��:
			Panel() 
				ʹ��Ĭ�ϵ� FlowLayout �಼�ֹ�������ʼ��;
				
			Panel(LayoutManager layout) 
				ʹ��ָ���Ĳ��ֹ�������ʼ��;
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
		
		f.add(p);				//Panel�޷�����������ʾ�����뱻��ӵ����������в�����ʾ;
		f.setVisible(true);
	}
}