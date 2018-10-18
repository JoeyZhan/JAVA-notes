/*
	event �¼�����_2
	
	�ı���ӷ��������_1
		�������������
		�����߼�����
		���Ƽ�
*/

import java.awt.*;
import java.awt.event.*;

public class Test_TextField_1
{
	public static TextField tf_1, tf_2, tf_3;
	public static void main(String[] args)
	{
		Frame f = new Frame("Addition");
		f.setLayout(new FlowLayout());
		tf_1 = new TextField(30);
		tf_2 = new TextField(30);
		tf_3 = new TextField(30);
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
}

class MyMonitor extends WindowAdapter implements ActionListener
{
	@Override	//��ʾ���µķ���Ϊ��д���������û����д���򱨴����ܣ��������밲ȫ��;
	public void actionPerformed(ActionEvent e)
	{
		 String str_1 = Test_TextField_1.tf_1.getText();
		 String str_2 = Test_TextField_1.tf_2.getText();
		 int numb_1 = Integer.parseInt(str_1);		//��Stringת����int����;
		 int numb_2 = Integer.parseInt(str_2);
		 int numb_3 = numb_1 + numb_2;
		 
		 Integer it = new Integer(numb_3);
		 String str_3 = it.toString();		//��intת����String����;	(��һ�ַ���)
		 //str_3 = numb_3 + "";				//(�ڶ���)
		 //str_3 = Integer.toString(numb_3);//(������)
		 //str_3 = String.valueOf(numb_3);	//(������)
		 
		 Test_TextField_1.tf_3.setText(str_3);
	}
	
	public void windowClosing(WindowEvent e)
	{
		System.exit(-1);
	}
}