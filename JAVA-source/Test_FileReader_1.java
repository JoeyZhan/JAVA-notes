/*
	FileReader (文件字符输入流) 用法_1
		
		读取输出文本文件在显示器上_举例_1
	
		字符流只用于处理文本数据, 而字节流可以处理各种数据, 要比字符流强大得多;
*/

import java.io.*;

public class Test_FileReader_1
{
	public static void main(String[] args) throws IOException
	{
		int ch, cnt = 0;
		FileReader fr = new FileReader("Test_FileReader_1.java");	//如果没有写详细文件路径，则默认是在当前目录下;
		
		ch = fr.read();
		while (-1 != ch)
		{
			++cnt;
			System.out.printf("%c", (char)ch);
			ch = fr.read();
		}
		System.out.printf("\n\n字符个数为: %d\n", cnt);
		fr.close();
	}
}