/*
	FileInputStream 和 FileOutputStream (字节流)
	
		复制文件举例_2
		
		FileInputStream_FileOutputStream字节流可以完成所有格式文件的复制;
		FileReader_FileWriter只可以完成文本文件的复制，却无法完成视频格式文件的复制;
		
		因为字节是不需要解码和编码的，将字节转化为字符才存在解码和编码的问题;
		字节流可以从所有格式的设备中读写数据，但字符流只能从文本格式的设备中读写数据;

		(更好的复制文件的方法: Test_BufferedInputStream_OutputStream_Copy.java)	
*/

import java.io.*;

public class Test_FileInputStream_OutputStream_Copy
{
	public static void main(String[] args) throws IOException
	{
		int data;
		FileInputStream fis = new FileInputStream("E:\\PictureVideo\\影片\\Jason Mraz Serenades Patient at Children's of Alabama.mp4");
		FileOutputStream fop = new FileOutputStream("Jason Mraz Serenades Patient at Children's of Alabama.mp4");
		
		data = fis.read();
		while (-1 != data)
		{
			fop.write(data);
			data = fis.read();
		}
		
		fop.flush();	//刷新缓存区(多指内存), 将输出流中缓冲的数据全部写出到目的地，如果刷新缓存区，有可能导致数据没有存储到文件中;
						//这个方法只有在 Writer和OutputStream 中存在;
		fis.close();
		fop.close();
	}
}










