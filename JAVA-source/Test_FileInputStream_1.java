/*
	FileInputStream (�ļ��ֽ�������) �ı���ȡ�����ʱ���������
	
		��ȡ����ı��ļ�����ʾ����_����_2
		
		�ַ���ֻ���ڴ����ı�����, 
		���ֽ������Դ����������, �ֽ���Ҫ���ַ���ǿ��ö�;
		
		��������У����ֽ���ȥ��ȡ������ı�����ʱ�����������;
		ԭ��: 
			һ���ַ�Ϊ�����ֽڣ����ֽڶ�ȡֻ��ȡһ���ַ�;
		
			���ֽ������ַ�ʱ��ֻ��ȡ��8λ��Ӣ���ַ��и�8λ����Ч�ģ�Ϊ�հ����ݣ����Բ����������;
			�������ı��ߵ�8λ���洢�����ݣ����ֽ�����ȡ��������������;
			
*/

import java.io.*;

public class Test_FileInputStream_1
{
	public static void main(String[] args) throws IOException
	{
		int ch, cnt = 0;
		FileInputStream fr = new FileInputStream("C:/Users/Source/Desktop/Test_FileReader_1.java");		//���û��д��ϸ�ļ�·������Ĭ�����ڵ�ǰĿ¼��;
		
		ch = fr.read();
		while (-1 != ch)
		{
			++cnt;
			System.out.printf("%c", (char)ch);
			ch = fr.read();
		}
		System.out.printf("\n\n�ַ�����Ϊ: %d\n", cnt);		//���ʱ��������������;
		fr.close();
	}
}

/*
import java.io.*;

public class Test_FileReader_1
{
	public static void main(String[] args) throws IOException
	{
		int ch, cnt = 0;
		FileReader fr = new FileReader("C:/Users/Source/Desktop/Test_FileReader_1.java");
		
		ch = fr.read();
		while (-1 != ch)
		{
			++cnt;
			System.out.printf("%c", (char)ch);
			ch = fr.read();
		}
		System.out.printf("\n\n�ַ�����Ϊ: %d\n", cnt);
		fr.close();
	}
}*/





