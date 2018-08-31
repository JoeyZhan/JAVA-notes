/*
	event �¼�����_1
	
	�¼�(Event)
		�û��������һ����������֮Ϊһ���¼�;

	�¼�Դ(EventSource)
		�ܹ������¼���GUI��������簴ť���ı����;

	�¼�������(EventHandler)
		�ܹ����ա������ʹ����¼������ʵ�����û��������ܵķ���;

	�¼�������(EventListener)
		���Դ����¼���һ����;
		
	
	�¼�������ظ���
		Ĭ��������¼�Դ�����Զ������κ��¼�������Ա��Ҫ�������£�
			1.�����¼�Դ�����Զ����������¼����������¼�Դע��ĳ���¼����¼�����������;
		
			2.��ƺÿ��Դ��������¼����¼�������;
			
		һ����������������������û����¼�Դ���в���ʱ���¼�Դ�ͻ��Զ������¼����¼�Դ�ͻ��Զ��Ѳ������¼���װ��
		һ���¼������¼�Դ�ͻ��Զ��ѷ�װ�õ��¼����󴫵ݸ��¼�������;

		�¼��������յ��¼�Դ���͹������¼�ʱ���¼��������ͻ��Զ�������Ӧ���¼����������Ը��¼�������Ӧ�Ĵ���;
	
	
	�¼�������

		�����¼�ΪXXXX;

		1.���¼�Դע��ĳ���¼����¼�����������;
			addXXXXListener

		2.��ƺÿ��Դ��������¼����¼�������;
			class ���� implements XXXXListener
			{
				��дXXXXListener�ӿ��еķ���
			}

		˵��
			Ҫ����Ƴ��ܹ�����XXXX�¼��ļ�������ֻ��Ҫ��д��ʵ����XXXXListener�ӿڵ����0K�ˣ�
		��ΪXXXXListener�ӿ����Ѿ������˿��Դ���XXXX�¼��ķ���;
	
	����
		�¼�����Щ��
			java.awt.event���к������е��¼���
			���õ��¼��У�
				ActionEvent���������ʱ�������¼�
				KeyEvent����������ʱ����
				MouseEvent���������ʱ����
				WindowEvent����������ʱ�������¼�������󻯻���С��ĳһ���ڡ�
				
		һ���¼�Դ�����Զ�������Щ�¼���
				������������Զ���ʾ������Ҫ��Ϊ��Ϊ���䣡
*/

import java.awt.*;
import java.awt.event.*;

public class Test_event_Button_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("event");
		Button bt_1 = new Button("Hi!");
		f.add(bt_1);
		
		//AL a = new AL();
		//WB b = new WB();
		bt_1.addActionListener(new AL());
		f.addWindowListener(new WB()); 
		
		f.pack();
		f.setVisible(true);
	} 
}

class WB extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(-1);
	}
}

class AL implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hello world!!!");
	}
}