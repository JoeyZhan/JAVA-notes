/*
	UDP 网络编程
	
	客户端/发送端
*/

import java.io.*;
import java.net.*;

public class Test_UDP_Client 
{
	public static void main(String args[]) throws Exception
	{
		//定义码头(套接字)
		DatagramSocket ds = new DatagramSocket();
		
		long l = 10000L;
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeLong(l);
		
		byte buf[] = baos.toByteArray();
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 5218);		
		/*
			"127.0.0.1"为String数据类型，不是IP地址，IP地址在java中是用 java.net.InetAddress 类 表示,
			而java.net.InetAddress 并没有构造方法，因此要把"127.0.0.1"转化成ip地址，可以写成：
			InetAddress.getByName("127.0.0.1") 或者 new InetSocketAddress("127.0.0.1", 5218),	后者必须输入ip+端口号;
			
			e.g.
			DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5218));
		*/
		
		ds.send(dp);	//在码头上把集装箱中的数据发送给对方
		ds.close();
	}
}