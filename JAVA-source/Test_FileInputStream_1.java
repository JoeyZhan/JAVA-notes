/*
	FileInputStream (文件字节输入流) 文本读取并输出时乱码的问题
	
		读取输出文本文件在显示器上_举例_2
		
		字符流只用于处理文本数据, 
		而字节流可以处理各种数据, 字节流要比字符流强大得多;
		
		这个程序中，用字节流去读取并输出文本数据时，会出现乱码;
		原因: 
			一个字符为两个字节，而字节读取只读取一个字符;
		
			用字节流读字符时，只读取低8位，英文字符中高8位是无效的，为空白数据，所以不会出现乱码;
			而中文文本高低8位都存储着数据，用字节流读取并输出则成了乱码;
			
*/

import java.io.*;

public class Test_FileInputStream_1
{
	public static void main(String[] args) throws IOException
	{
		int ch, cnt = 0;
		FileInputStream fr = new FileInputStream("C:/Users/Source/Desktop/Test_FileReader_1.java");		//如果没有写详细文件路径，则默认是在当前目录下;
		
		ch = fr.read();
		while (-1 != ch)
		{
			++cnt;
			System.out.printf("%c", (char)ch);
			ch = fr.read();
		}
		System.out.printf("\n\n字符个数为: %d\n", cnt);		//输出时，这里会出现乱码;
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
		System.out.printf("\n\n字符个数为: %d\n", cnt);
		fr.close();
	}
}*/





