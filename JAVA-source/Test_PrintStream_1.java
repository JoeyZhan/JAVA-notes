/*
	PrintStream 
		
		Print流
			
			Print 流只输出，不输入
			
		Print流的由来
		
			Writer 的 write 方法可以写入:
				一个字符
				一个字符数组
				一个字符数组的一部分
				一个字符串
				一个字符的一部分
			
			OutputStream 的 write 方法可以写入:
				一个字节
				一个字节数组
				一个字节数组的一部分
				
			DataOutputStream 流可以写入:
				一个字节
				一个字节数组(继承自OutputStream)
				一个字节数组的一部分
				所有的基本类型数据的二进制代码
					e.g. WriteDouble(8.8); 写入的是 8.8 的二进制代码，共占8个字节
					
			PrintStream 流的 print 可以写入:
				所有基本类型数据类型的字符形式表示
					e.g. print(8.8); 写入的是'8''.''8'这三个字符，共占3个字节
					
		
		PrintStream 在 OutputStream 基础之上提供了增强的功能，即可以方便地输出各种类型数据(而不仅限于byte型)的格式化表示形式;
		
		PrintStream 重载了 print 和 println 方法，用于各种不同类型数据的格式化输出;
		
		DataOutputStream 中的 writeXXX(data)方法是把data在内存中的二进制数据写入文件;
		
		PrintStream 中的 println(data) 写出的是该数据的格式化后的字符串;

		//格式化输出是指将一个数据用其字符串格式输出;
*/

import java.io.*;

public class Test_PrintStream_1
{
	public static void main(String[] args) throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("test_1.txt"));
		dos.writeLong(1234567890);		//DataOutputStream写入的是二进制;
		dos.close();
		
		PrintStream ps = new PrintStream(new FileOutputStream("test_2.txt"));
		ps.println(1234567890);			//PrintStream写入的是字符: '1' '2' '3'...;
		ps.close();
	}
}