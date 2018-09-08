/*
	FileReader �� FileWriter (�ַ���)
	
		�����ļ�����_1
		
		FileInputStream_FileOutputStream�ֽ�������������и�ʽ�ļ��ĸ���;
		FileReader_FileWriterֻ��������ı��ļ��ĸ��ƣ�ȴ�޷������Ƶ��ʽ�ļ��ĸ���;

		��Ϊ�ֽ��ǲ���Ҫ����ͱ���ģ����ֽ�ת��Ϊ�ַ��Ŵ��ڽ���ͱ��������;
		�ֽ������Դ����и�ʽ���豸�ж�д���ݣ����ַ���ֻ�ܴ��ı���ʽ���豸�ж�д����;
		
		(���õĸ����ı��ļ��ķ���: Test_BufferedReader_Writer_Copy.java)		
*/

import java.io.*;

public class Test_FileReader_Writer_Copy
{
	public static void main(String[] args) throws IOException
	{
		int data;		
		FileReader fr = new FileReader("Test_FileReader_Writer_Copy.java");
		FileWriter fw = new FileWriter("Test_1.txt");
		
		data = fr.read();
		while (-1 != data)
		{
			fw.write(data);
			data = fr.read();
		}
		
		fw.flush();		//ˢ�»�����(��ָ�ڴ�), ��������л��������ȫ��д����Ŀ�ĵأ����ˢ�»��������п��ܵ�������û�д洢���ļ���;
						//�������ֻ���� Writer��OutputStream �д���;
		fw.close();
		fr.close();
	}
}










