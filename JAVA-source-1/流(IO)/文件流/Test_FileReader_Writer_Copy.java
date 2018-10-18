/*
	FileReader 和 FileWriter (字符流)
	
		复制文件举例_1
		
		FileInputStream_FileOutputStream字节流可以完成所有格式文件的复制;
		FileReader_FileWriter只可以完成文本文件的复制，却无法完成视频格式文件的复制;

		因为字节是不需要解码和编码的，将字节转化为字符才存在解码和编码的问题;
		字节流可以从所有格式的设备中读写数据，但字符流只能从文本格式的设备中读写数据;
		
		(更好的复制文本文件的方法: Test_BufferedReader_Writer_Copy.java)		
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
		
		fw.flush();		//刷新缓存区(多指内存), 将输出流中缓冲的数据全部写出到目的地，如果刷新缓存区，有可能导致数据没有存储到文件中;
						//这个方法只有在 Writer和OutputStream 中存在;
		fw.close();
		fr.close();
	}
}










