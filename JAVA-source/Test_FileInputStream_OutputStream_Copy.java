/*
	FileInputStream �� FileOutputStream (�ֽ���)
	
		�����ļ�����_2
		
		FileInputStream_FileOutputStream�ֽ�������������и�ʽ�ļ��ĸ���;
		FileReader_FileWriterֻ��������ı��ļ��ĸ��ƣ�ȴ�޷������Ƶ��ʽ�ļ��ĸ���;
		
		��Ϊ�ֽ��ǲ���Ҫ����ͱ���ģ����ֽ�ת��Ϊ�ַ��Ŵ��ڽ���ͱ��������;
		�ֽ������Դ����и�ʽ���豸�ж�д���ݣ����ַ���ֻ�ܴ��ı���ʽ���豸�ж�д����;

		(���õĸ����ļ��ķ���: Test_BufferedInputStream_OutputStream_Copy.java)	
*/

import java.io.*;

public class Test_FileInputStream_OutputStream_Copy
{
	public static void main(String[] args) throws IOException
	{
		int data;
		FileInputStream fis = new FileInputStream("E:\\PictureVideo\\ӰƬ\\Jason Mraz Serenades Patient at Children's of Alabama.mp4");
		FileOutputStream fop = new FileOutputStream("Jason Mraz Serenades Patient at Children's of Alabama.mp4");
		
		data = fis.read();
		while (-1 != data)
		{
			fop.write(data);
			data = fis.read();
		}
		
		fop.flush();	//ˢ�»�����(��ָ�ڴ�), ��������л��������ȫ��д����Ŀ�ĵأ����ˢ�»��������п��ܵ�������û�д洢���ļ���;
						//�������ֻ���� Writer��OutputStream �д���;
		fis.close();
		fop.close();
	}
}










