/*
	FileReader (�ļ��ַ�������) �÷�_1
		
		��ȡ����ı��ļ�����ʾ����_����_1
	
		�ַ���ֻ���ڴ����ı�����, ���ֽ������Դ����������, Ҫ���ַ���ǿ��ö�;
*/

import java.io.*;

public class Test_FileReader_1
{
	public static void main(String[] args) throws IOException
	{
		int ch, cnt = 0;
		FileReader fr = new FileReader("Test_FileReader_1.java");	//���û��д��ϸ�ļ�·������Ĭ�����ڵ�ǰĿ¼��;
		
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
}