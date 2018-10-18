/*
	BufferedReader 和 BufferedWriter (字符缓冲流)
	
		字符缓冲流复制 文本文件举例_1
*/

import java.io.*;

public class Test_BufferedReader_Writer_Copy
{
	public static void main(String[] args) throws IOException
	{
		String str = null;
		
		BufferedReader br = new BufferedReader(new FileReader("Test_BufferedReader_Writer_Copy.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"));
		
		str = br.readLine();		//读一行字符串
		while (null != str)
		{
			bw.write(str);
			bw.newLine();			//写入一个行分隔符
			str = br.readLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}