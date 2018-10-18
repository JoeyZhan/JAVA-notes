/*
	BufferedInputStream 和 BufferedOutputStream (字节缓冲流)
	
		缓冲流复制文件举例_1
		
		缓冲流是包裹流的一种
		
		作用：建立一个缓冲区，使得把读写的数据一次性先放入缓冲区，再进行处理，减少对io的访问次数，保护硬盘，且提升了速度；
			  带缓冲区的流要比普通的流 的速度要快很多;
			  
			  Buffered里有可以设定缓冲区的大小的方法，但缓冲区不够空间时会自动扩张，所以这个方法并没有什么卵用;
			  (BufferedIntputStream(IntputStream in, int size));
*/

import java.io.*;

public class Test_BufferedInputStream_OutputStream_Copy
{
	public static void main(String[] args) throws IOException
	{
		int len;
		byte[] data = new byte[1024];
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\PictureVideo\\影片\\Jason Mraz Serenades Patient at Children's of Alabama.mp4"));
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