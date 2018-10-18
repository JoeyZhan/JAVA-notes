/*
	BufferedInputStream �� BufferedOutputStream (�ֽڻ�����)
	
		�����������ļ�����_1
		
		�������ǰ�������һ��
		
		���ã�����һ����������ʹ�ðѶ�д������һ�����ȷ��뻺�������ٽ��д������ٶ�io�ķ��ʴ���������Ӳ�̣����������ٶȣ�
			  ������������Ҫ����ͨ���� ���ٶ�Ҫ��ܶ�;
			  
			  Buffered���п����趨�������Ĵ�С�ķ������������������ռ�ʱ���Զ����ţ��������������û��ʲô����;
			  (BufferedIntputStream(IntputStream in, int size));
*/

import java.io.*;

public class Test_BufferedInputStream_OutputStream_Copy
{
	public static void main(String[] args) throws IOException
	{
		int len;
		byte[] data = new byte[1024];
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\PictureVideo\\ӰƬ\\Jason Mraz Serenades Patient at Children's of Alabama.mp4"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Jason Mraz Serenades Patient at Children's of Alabama.mp4"));
		
		len = bis.read(data);
		while (-1 != len)
		{
			bos.write(data);
			len = bis.read(data);
		}
		
		bos.flush();
		bis.close();
		bos.close();
	}
}