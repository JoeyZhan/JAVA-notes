/*
	Frame ���÷�_1
	
		Frame �ĳ��÷���
		
			public void setBounds(int x, int y, int width, int height)
				���ô���λ�����С��x��y ��ʾ���������Ļ��ˮƽ�ʹ�ֱ����,	width��height ��ʾ���屾��� ��Ⱥ͸߶�;
				
			public void setSize(int width, int height)
				���ô����С;
			
			public void setBackground(Color c)
				���ô���ı���ɫ;
				
			public void setVisible(boolean flag);
				���ô����Ƿ�ɼ���true��false��Ĭ��Ϊfalse;
*/

import java.awt.*;

public class Test_Frame_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("FRAME");		//����Frame����ʾ��Ϊ FRAME;	//���ڴ��в�����һ������Ҫ������ʾ����ʾ�������õ���setVisible��
		Button bt = new Button("BUTTON");	//����Button����ʾ��Ϊ BUTTON;
		
		f.add(bt);							//���bt ������� ����f �������ʾ;
		//f.setSize(250, 250);				//���ô�����ʾ��С;
		//f.setLocation(300, 300);			//���ô�����ʾλ��;
		f.setBounds(300, 300, 250, 250);	//�������������ü�����һ��;
		f.setBackground(Color.RED);			//���ñ���ɫ;
		f.setVisible(true);					//���ô����Ƿ�ɼ���Ĭ��Ϊfalse;
	}
}