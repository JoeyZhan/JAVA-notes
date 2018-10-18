/*
	event �¼�����_4
	
	�ı���ӷ��������_3
	
	TestField������
		TextField������ܷ���Action��������ı������ûس����¼�, ����¼���Ӧ���¼�����java.awt.event.ActionEVent;
		
		��������ActionEvent�¼���ʵ����java.awt.event.ActionListener�ӿڵ���Ķ���,
		ActionListener�ӿڶ����з�����
			public void actionPerformed(ActionEvente)
			
		ʵ�ָýӿڵ���Ҫ�ڸ÷�������Ӵ�����¼���Action�������;
		
		ʹ�� addActionListener(ActionListenerl������Ϊ TextField���� ע��һ�� ActionListener ���󣬵�TextField������Action�¼�ʱ��������һ��
		ActionEvent���󣬸ö�����Ϊ�������ݸ� ActionLIStener���� �� actionPerformer ���� �� �����п��Ի�ȡ�ö������Ϣ��������Ӧ�Ĵ���;
	
	�ڲ�����÷�(���ص�)
		�ڲ���
			���壺
				��A����ڲ��������з������ⲿ������һ��B�࣬��B�����A����ڲ��࣬A��B���ⲿ��;
				
		���԰��ڲ��൱�����������ⲿ���һ����Ա����������ڲ���Ĺؼ�;
		
		�ڲ�����ŵ㣺
			�ڲ�������з��������Է����ⲿ������г�Ա;
			���ӳ���İ�ȫ�ԣ���Ч���������������Ը���ķ���;
		
		��ʱʹ��
			���һ��B��Ҫʹ��A������г�Ա������B�಻��Ҫ����A���������������ʣ�������Ӧ����B�ඨ��ΪA����ڲ���;

*/

import java.awt.*;
import java.awt.event.*;

public class Test_TextField_3
{
	public static void main(String[] args)
	{
		TF tf = new TF();
		tf.launch();
	}
}

class TF
{
	private TextField tf_1, tf_2, tf_3;
	
	public void launch()
	{
		tf_1 = new TextField(20);
		tf_2 = new TextField(20);
		tf_3 = new TextField(20);
		Frame f = new Frame("Addition");
		f.setLayout(new FlowLayout());
		Button bt = new Button("=");
		Label lb = new Label("+");
		
		f.add(tf_1);
		f.add(lb);
		f.add(tf_2);
		f.add(bt);
		f.add(tf_3);
		
		f.addWindowListener(new MyMonitor());
		bt.addActionListener(new MyMonitor());
		
		f.pack();
		f.setVisible(true);
	}
	
	class MyMonitor extends WindowAdapter implements ActionListener		//�ڲ���
	{
		public void actionPerformed(ActionEvent e)
		{
			String str_1 = tf_1.getText();
			String str_2 = tf_2.getText();
			int numb_1 = Integer.parseInt(str_1);
			int numb_2 = Integer.parseInt(str_2);
			int numb_3 = numb_1 + numb_2;
			tf_3.setText(numb_3 + "");
		}
		
		public void windowClosing(WindowEvent e)
		{
			System.exit(-1);
		}
	}
}