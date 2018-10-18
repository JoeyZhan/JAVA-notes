/*
	ByteArrayInputStream/OutputStream 和 DataInputStream/OutputStream (数据流)
	
		将一个长整型数据写入字节数组然后再从字节数组读出来_举例_1
		
			把一个long类型的数据写入byte数组中,然后再从byte数组中读取出这个long类型的数据
			  
			因为网络编程中经常要把数值型数据存入byte数组中然后打包成DatagramPacket经过网络传输到目的计算机，
			目的计算机再从byte数组中把原数值型数据还原回来;
		
		ByteArrayOutputStream   DataOutputStream  ByteInputStream DataInputStream 流的使用
			
			DataOutputStream流中的writeLong(long n)是把n变量在内存中的二进制代码写入该流所连接到的设备中;

*/

import java.io.*;

public class Test_ByteArray_DataInputStream
{
	public static void main(String[] args) throws IOException
	{
		long l = 12345678910L;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		/*
			24行API:"public ByteArrayOutputStream(): 创建一个新的 byte 数组输出流。缓冲区的容量最初是 32 字节，如有必要可增加其大小。 "
			24行代码一旦执行完毕，意味着两点: 1、在内存中生成了一个大小为32个字节的byte数组;
											  2、有一根叫做baos的管道已链接到了该byte数组中，并且可以通过这个管道向该byte数组中写入数据;
			虽然此时可以通过baos向baos所连接到的在内存中分配好的byte数组中写入数据，
			但是ByteArrayOutputStream流并 没有 提供 可以直接把long类型数据 直接写入ByteArrayOutputStream流所连接到的byte数组中的方法, 
			简单说我们没法通过baos向baos所连接到的byte数组中写入long类型的数据, 
			查API文档可以发现: ByteArrayOutputStream流中并没有类似writeLong()这样的方法，
			但是 DataOutputStream 流中却有writeLong() writeFloat()等方法
		*/
		dos.writeLong(l);
		/*
			把n变量所代表的10000L在内存中的二进制代码写入dos所依附的baos管道所连接到的内存中的大小为32字节的byte数组中，
			由运行结果来看，这是二进制写入，不是把10000L转化为字符'1' '0' '0' '0' '0'写入byte数组中，
			而是把10000L在内存中的总共8个字节的二进制代码写入byte数组中;
		*/
		dos.flush();		
		
		byte[] bt = baos.toByteArray();
		dos.close();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bt);
		DataInputStream dis = new DataInputStream(bais);
		long l_2 = dis.readLong();
		dis.close();
		
		System.out.printf("%d\n", l_2);
	}
}